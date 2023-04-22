package com.company;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of students:");
        int n=sc.nextInt();
        float[] marks=new float[n];
        for(int i=0;i<marks.length;i++){
            System.out.printf("Enter marks of student %d:",i+1);
            marks[i]=sc.nextFloat();
        }
        float sum=0;
        for (float m:marks) {
            sum=sum+m;
        }
        System.out.println("The average is "+(sum/n));
    }
}
