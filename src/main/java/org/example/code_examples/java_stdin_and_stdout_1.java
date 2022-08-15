package org.example.code_examples;

import java.util.Scanner;

public class java_stdin_and_stdout_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println(a);
        }
    }
}
