package org.example.code_examples.coding_game;

import java.util.Scanner;

public class Temperatures {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse

        if(n <= 0){
            System.out.println("0");
            return ;
        }

        int minTemp = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526

            if(Math.abs(t) < Math.abs(minTemp) ){
                minTemp = t;
            } else if (Math.abs(t) == Math.abs(minTemp)){
                minTemp = Math.max(minTemp, t);
            }

        }




        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(minTemp);
    }
}
