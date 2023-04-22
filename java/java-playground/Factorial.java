package com.company;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 1, n;
        System.out.println("Enter the number;");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("Factorial:"+f);
    }
}
