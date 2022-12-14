package org.example.code_examples.coding_game;

import java.util.Scanner;

public class Shadows_of_the_Knight_Ep1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt(); // Starting position batman , X
        int Y0 = in.nextInt(); // Starting position batman , Y

        int minx = 0;
        int miny = 0;

        int maxx = W-1;
        int maxy = H-1;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            System.err.println(bombDir);
            System.err.println(W);
            System.err.println(H);
            System.err.println(N);


            if(bombDir.contains("D")){
                miny = Y0 + 1;
            }

            if(bombDir.contains("U")){
                maxy =  Y0 - 1;
            }

            if(bombDir.contains("R")){
                minx = X0 + 1;
            }

            if(bombDir.contains("L")){
                maxx = X0 - 1;
            }

            X0 = minx + (maxx - minx) / 2;
            Y0 = miny + (maxy - miny) / 2;


            // the location of the next window Batman should jump to.
            System.out.println(X0 + " " + Y0);
        }
    }
}
