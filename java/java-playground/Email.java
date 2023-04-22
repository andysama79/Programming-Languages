package com.company;
import java.util.Scanner;
public class Email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String msg="Dear name, thanks a lot!";
        System.out.println("Your name:");
        String name=sc.nextLine();
        System.out.println(msg.replace("name",name));
    }
}
