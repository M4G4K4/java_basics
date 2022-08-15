package org.example.code_examples;

public class RepeatedSubStringPattern {
    public static void main(String[] args) {

    }

    public boolean repeatedSubstringPattern(final String s) {
        int len = s.length();

        for (int i = len / 2; i > 0; i--) {
            if (len % 2 == 0) {
                int numSubstrings = len / i;
                StringBuilder stringBuilder = new StringBuilder();
                String string = s.substring(0, i);

                for (int j = 0; j < numSubstrings; j++) {
                    stringBuilder.append(string);
                }
                if (stringBuilder.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
