package com.company;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float[] arr=new float[5];
        float sum=0f;
        for(int i=0;i<5;i++) {
            System.out.printf("Enter number %d:",i+1);
            arr[i]=sc.nextFloat();
            sum+=arr[i];
        }
        System.out.printf("The sum is %.2f:",sum);
    }
}
