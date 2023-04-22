package com.company;
import java.util.Scanner;
public class Sieve2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        for(int i=1;i<=N;i++){
            if(factors(i)%2!=0)
                /*when you workout the initial steps of the problem
                 you will notice that numbers having odd number of
                  divisors are the ones that are not filled*/
                count++;
        }
        System.out.println(count);
    }
    public static int factors(int N){
        int count=0;
        for(int i=1;i<=N;i++){
            if(N%i==0)
                count++;
        }
        return count;
    }
}
