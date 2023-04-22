package com.company;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks in English");
        int en=sc.nextInt();
        System.out.println("Enter Marks in Mathematics");
        int ma=sc.nextInt();
        System.out.println("Enter Marks in Physics");
        int ph=sc.nextInt();
        System.out.println("Enter Marks in Chemistry");
        int ch= sc.nextInt();
        System.out.println("Enter Marks in Computer Science");
        int cs= sc.nextInt();
        double sum=en+ma+ph+ch+cs;
        double avg=(sum/5);
        System.out.println("The percentage is:"+avg);
    }
}
