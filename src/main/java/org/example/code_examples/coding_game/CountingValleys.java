package org.example.code_examples.coding_game;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    public static int countingValleys(int steps,final String path) {
        int valleys = 0;
        int mountains = 0;
        final String[] paths = path.split("");
        int seaLevel = 0;

       for(int i = 0; i < paths.length; i++){
           if(paths[i].equals("U")){
               seaLevel++;
               if(seaLevel == 0 ){
                   valleys++;
               }
           }else if (paths[i].equals("D")){
               seaLevel--;
               if(seaLevel == 0){
                   mountains ++;
               }
           }


       }
        System.out.println(mountains);
        System.out.println(valleys);
        return valleys;
    }
}
