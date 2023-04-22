package com.company;
import java.util.Scanner;
public class ArrayPresence {
    public static void main(String[] args) {
        int[] arr={56,77,79,65,43,54,23,36,74,32};
        System.out.println("Whatcha looking for man?:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean pen =false;
        int i=0;
        while(!pen && i<arr.length ){
            if(arr[i]==n)
                pen=true;
            i++;
        }
        if(pen)
            System.out.printf("Present at: %d",i);
        else
            System.out.println("Not present");

    }
}
