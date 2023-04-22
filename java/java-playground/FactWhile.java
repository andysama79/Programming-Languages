package com.company;
import java.util.Scanner;
public class FactWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        while(n>0) {
            f = f * n;
            n--;
        }
        System.out.println("Factorial:"+f);
    }
}
