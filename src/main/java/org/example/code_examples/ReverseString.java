package org.example.code_examples;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("cenas"));
        System.out.println(reverse2("cenas"));
        System.out.println(reverse3("cenas"));
        System.out.println(reverse4("cenas"));
        System.out.println(new StringBuilder().append("cenas").reverse());
    }

    public static String reverse(String a) {
        int j = a.length();
        char[] newWord = new char[j];
        for (int i = 0; i < a.length(); i++) {
            newWord[--j] = a.charAt(i);
        }
        return new String(newWord);
    }

    public static String reverse2(String a) {
        char[] newWord = new char[a.length()];
        for (int i = 0, j = a.length() - 1; i < a.length(); i++, j--) {
            newWord[j] = a.charAt(i);
        }
        return new String(newWord);
    }


    // Like more this one
    public static String reverse3(String a) {
        int size = a.length();
        char[] word = new char[size];
        for (int i = size - 1, j = 0; i >= 0; i--, j++) {
            word[j] = a.charAt(i);
        }
        return new String(word);
    }

    public static String reverse4(String str) {
        char[] ch = str.toCharArray();
        final StringBuilder rev = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            rev.append(ch[i]);
        }
        return rev.toString();
    }
}
