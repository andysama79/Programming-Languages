package com.company;
import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,res;
        System.out.println("Enter number 1:");
        n1=sc.nextInt();
        System.out.println("Enter number 2:");
        n2=sc.nextInt();
        res=n1+n2;
        System.out.println("The result is:"+res);
    }
}
