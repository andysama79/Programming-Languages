package com.company;
import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter grade:");
        char grade=sc.next().charAt(0);
        char encrypt=(char)(grade+8);
        System.out.println("Encrypted grade:"+encrypt);
        System.out.println("Decrypted grade:"+grade);
    }
}
