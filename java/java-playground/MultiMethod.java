package com.company;
import java.util.Scanner;
public class MultiMethod {

   static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number:");
        int n=sc.nextInt();
        table(n);
    }
    public static void table(int n)
    {
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
}

