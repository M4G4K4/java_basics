package org.example.code_examples;

public class RepeatedString {
    public static void main(String[] args) {

        System.out.println(repeatedString2("aba", 10));
    }

    public static long repeatedString(String s, long n) {
        double numberOfAppearances = s.chars().filter(letter -> letter=='a').count(); // 2

        return Math.round((numberOfAppearances * n) / s.length());
    }

    public static long repeatedString2(String s, long n) {
        long count =0;
        for(char c : s.toCharArray())
            if(c == 'a')
                count++;

        long factor = (n/s.length());
        long rem = (n%s.length());
        count =  factor*count  ;
        for(int i=0;i<rem;i++)
            if(s.charAt(i)=='a')
                count++;
        return count;
    }
}
