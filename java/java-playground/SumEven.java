package com.company;
import java.util.Scanner;
public class SumEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range:");
        int r=sc.nextInt();
        int sum=0;
        for(int i=0;i<2*r;i+=2) {
            sum+=i;
        }
        System.out.println("The sum is:"+sum);
    }
}
