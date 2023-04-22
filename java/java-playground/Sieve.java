package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Sieve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int counter=0;
        boolean []fill=new boolean[N];
        Arrays.fill(fill, true);
        for(int i=0;i<N;i++){
            for(int j=i+1;j<=N;j++){
                if(j%(i+1)==0){
                    fill[j-1]=!fill[j-1];
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.println(fill[i]);
        }
        for(int i=0;i<N;i++){
            if(!fill[i]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
