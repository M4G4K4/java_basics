package org.example.code_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

//Transform List of number in a list of those numbers transformed in roman numbers
// example: [1,5,10] -> ["I", "V", "X"]

/*
        1	  I	 	      40	  XL
	   2	  II	 	  50	  L
	   3 	  III		  90	  XC
	   4 	  IV	 	 100	  C
	   5  	  V	 	     400 	  CD
	   6 	  VI	 	 500	  D
	   7 	  VII	 	 900	  CM
	   8 	  VIII	 	1000 	  M
	   9	  IX
	   10 	  X
 */

public class Romanizer {
    public static void main(String[] args) {
        final List<Integer> numbers = List.of(1000);


        final List<String> results = new ArrayList<>();
        for(Integer number: numbers){
            String roman = "";


            if(number > 1000){
                roman += "M";
                number -= 1000;
            }

            if(number > 900){
                roman += "CM";
                number -= 900;
            }

            if(number > 500){
                roman += "D";
                number -= 500;
            }
            // ...

            results.add(roman);
        }

        // ------------------------------------

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(5, "V");

        //map.floorKey();

        // Loop



        System.out.println(results);
    }
}
