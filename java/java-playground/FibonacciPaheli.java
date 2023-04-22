package com.company;

public class FibonacciPaheli {
    public static void main(String[] args) {

        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                fibogen(i,j);
                System.out.println();
            }
        }
    }
    public static void fibogen(int a, int b){
        int n=8;
        System.out.print(a+"\t"+b+"\t");
        while(n>0){
            int c=a+b;
            String num=Integer.toString(c);
            System.out.print(num.charAt(num.length()-1)+"\t");
            a=b;
            b=c;
            n--;
        }
    }
}
