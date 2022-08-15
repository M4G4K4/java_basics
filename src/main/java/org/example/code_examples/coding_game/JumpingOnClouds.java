package org.example.code_examples.coding_game;

import java.util.List;

public class JumpingOnClouds {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(List.of(0, 0, 1, 0, 0, 1, 0)));
    }

    public static int jumpingOnClouds(final List<Integer> c) {
        int count = 0;
        for (int i = 0; i < c.size(); ) {
            if ( i + 2 < c.size() &&   c.get(i + 2) == 0) {
                count++;
                i = i + 2;
            } else if (i + 1 < c.size() && c.get(i + 1) == 0) {
                count++;
                i = i + 1;
            }else {
                i ++;
            }
        }

        return count;
    }
}
