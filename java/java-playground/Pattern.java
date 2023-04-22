package com.company;

public class Pattern {
    public static void main(String[] args) {
        int i=4,j=0;
        while(i>0){
            while(j<i){
                System.out.print("*");
                j++;
            }
            j=0;
            System.out.println();
            i--;
        }
    }
}
