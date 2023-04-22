package com.company;
import java.util.Scanner;
public class IfInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        boolean res=sc.hasNextInt();
        System.out.println("The entered number is an integer:"+res);
    }
}
