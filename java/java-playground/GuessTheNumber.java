package com.company;
import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    static Scanner sc=new Scanner(System.in);
    private int randomNumber;
    static int userInput;
    static int count;
    public GuessTheNumber(){
        Random r=new Random();
        randomNumber=r.nextInt(100);
    }

    public static void main(String[] args) {
        GuessTheNumber obj=new GuessTheNumber();
        boolean ans=obj.isCorrectNumber();
        if(ans)
            System.out.println("You WON! Number of chances:"+count);
    }
    public void takeUserInput(int n){
        userInput=n;
    }
    public boolean isCorrectNumber(){
        System.out.println("Enter guess:");
        count=0;
        boolean b;
        for(; ; ){
            takeUserInput(sc.nextInt());
            if(userInput>randomNumber)
                System.out.print("greater");
            else if(userInput<randomNumber)
                System.out.print("lesser");
            else {
                b = true;
                break;
            }
            System.out.println();
            count++;
        }
        return b;
    }
}
