package com.company;
import java.util.Scanner;
public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int[] arr=new int[end+start+1];
    }

    public static int sumDigits(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        if(isPrime(sum))
            return sum;
        if(sum/10==0 && !isPrime(sum))
            return squareDigits(sum);
        else
            return sumDigits(sum);
    }
    public static int squareDigits(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        if(isPrime(sum))
            return sum;
        else
            return sumDigits(sum);
    }
    public static boolean isPrime(int n){
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0)
            return true;
        else
            return false;
    }
}
