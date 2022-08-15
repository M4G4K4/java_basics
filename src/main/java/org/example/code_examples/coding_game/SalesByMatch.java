package org.example.code_examples.coding_game;

import java.util.*;

public class SalesByMatch {
    public static void main(String[] args) {

        final List<Integer> socks = new ArrayList<>();
        socks.add(1);
        socks.add(1);
        socks.add(2);
        socks.add(3);
        socks.add(1);
        socks.add(2);

        /*
        final HashMap<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, List.of(2));
        System.out.println(map.get(1));
         */

        final List<String> list = new ArrayList<>(Arrays.asList("A", "B"));
        list.add("2");


        System.out.println(sockMerchant(socks.size(), socks));
    }

    public static int sockMerchant(final int n, final List<Integer> ar) {
        final Set<Integer> set = new HashSet<>();
        int pairs =0;

        for(Integer num: ar){
            if (!set.contains(num)){
               set.add(num);
            }else{
                set.remove(num);
                pairs++;
            }
        }

        return pairs;
    }
}
