package com.company;


import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int userIn;
        int compIn;
        int userPt=0,compPt=0;
        System.out.println("Enter number of rounds:");
        int round=sc.nextInt();

        System.out.println("Enter 1 for Rock\nEnter 2 for Paper\nEnter 3 for Scissor\n");
        while(round>0)
        {
            userIn=sc.nextInt();
            //System.out.println(userIn);
            compIn=ran.nextInt(3)+1;
            System.out.println(compIn);

            if(userIn==1 && compIn==2)
                compPt++;
            else if(userIn==2 && compIn==3)
                compPt++;
            else if(userIn==3 && compIn==1)
                compPt++;

            else if(userIn==2 && compIn==1)
                userPt++;
            else if(userIn==3 && compIn==2)
                userPt++;
            else if(userIn==1 && compIn==3)
                userPt++;

            if (compIn != userIn) {
                round--;
            }

        }
        if(userPt==compPt)
            System.out.println("DRAW");
        if(userPt>compPt)
            System.out.println("User Wins");
        else
            System.out.println("Computer wins");
        System.out.printf("User:%d and Comp:%d",userPt,compPt);
    }
}
