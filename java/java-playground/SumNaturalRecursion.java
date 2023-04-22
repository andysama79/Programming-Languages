package com.company;
import java.util.Scanner;
public class SumNaturalRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sumNatural(n);
        System.out.println(sum);
    }
    public static int sumNatural(int n){
        if(n==1)
            return n;
        else
            return n+sumNatural(n-1);
    }
}
