package org.example.code_examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Definição de Anagrama: Palavra que pode ser construida a partir das letas de outra
 * example:
 *  caos & saco
 *  Tem as mesmas letas , apenas em ordens diferentes
 */
public class Anagram {

    public static void main(String[] args) {

    }

    // Sorting arrays of the strings
    public static boolean isAnagram(final String string1, final String string2){
        if (string1 == null || string2 == null || string1.isBlank() || string2.isBlank()) {
            return false;
        }

        if (string1.length() != string2.length()) {
            return false;
        }

        char[] arr1 = string1.toLowerCase().trim().toCharArray();
        char[] arr2 = string2.toLowerCase().trim().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Equaling maps
    public static boolean isAnagram2(final String str1,final String str2) {
        final Map<Character, Integer> map1 = new HashMap<>();
        final Map<Character, Integer> map2 = new HashMap<>();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        for (char value : arr1) {
            if (!map1.containsKey(value)) {
                map1.put(value, 1);
            } else {
                int c = map1.get(value);
                map1.put(value, ++c);
            }
        }

        for (char value : arr2) {
            if (!map2.containsKey(value))
                map2.put(value, 1);
            else {
                int d = map2.get(value);
                map2.put(value, ++d);
            }
        }

        return map1.equals(map2);
    }
}
