package org.example.code_examples;

/**
 * LeetCode
 *
 *  Is the number palindrome ?
 *
 *  A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
 *
 */

public class PalindromeNumber {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int x) {
        final String numString = Integer.toString(x);
        final StringBuilder stringBuilder = new StringBuilder(numString).reverse();
        return stringBuilder.toString().equals(numString);
    }

    public static boolean isPalindrome2(int x) {
        // If x is a negative number it is not a palindrome
        // If x % 10 = 0, in order for it to be a palindrome the first digit should also be 0
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;

        int res = 0;

        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        // If x is equal to reversed number then it is a palindrome
        // If x has odd number of digits, dicard the middle digit before comparing with x
        // Example, if x = 23132, at the end of for loop x = 23 and reversedNum = 231
        // So, reversedNum/10 = 23, which is equal to x
        return (x == res || x == res / 10);
    }
}
