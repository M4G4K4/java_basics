package org.example.code_examples.coding_game;

import java.util.Scanner;

public class TheDescent {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int max = 0;
            int index = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                if(mountainH > max){
                    max = mountainH;
                    index = i;
                }

            }

            System.out.println(index);
        }
    }
}
