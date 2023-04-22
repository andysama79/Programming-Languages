package com.company;
import java.util.Scanner;
public class UnderScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str=sc.nextLine();
        System.out.println(str.replace(" ","_"));
    }
}
