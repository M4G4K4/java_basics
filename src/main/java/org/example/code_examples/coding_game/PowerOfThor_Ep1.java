package org.example.code_examples.coding_game;

import java.util.Scanner;

public class PowerOfThor_Ep1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        while (true) {
            int remainingTurns = in.nextInt();

            String direction = "";

            if (initialTy < lightY)
            {
                initialTy++;
                direction = "S";
            }

            else if (initialTy > lightY)
            {
                initialTy--;
                direction = "N";
            }

            if (initialTx < lightX)
            {
                initialTx++;
                direction += "E";
            }

            else if (initialTx > lightX)
            {
                initialTx--;
                direction += "W";
            }

            System.out.println(direction);
            // A single line providing the move to be made: N NE E SE S SW W or NW
            //System.out.println("SE");
        }
    }
}
