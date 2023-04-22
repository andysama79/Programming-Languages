package com.company;
//Program 16: Anagram of Word

import java.util.*;

public class Anagram
{

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String userInput = sc.next().toLowerCase();
        System.out.println("The Anagrams are : ");
        display("",userInput);
    }

    void display(String s1, String s2)
    {
        if(s2.length()<=1)
        {
            System.out.println(s1+s2);
        }
        else
        {
            for(int i=0; i<s2.length(); i++)
            {
                String x = s2.substring(i, i+1);//creating anagram
                String y = s2.substring(0, i);//creating anagram
                String z = s2.substring(i+1);//creating anagram
                display(s1+x, y+z);
            }
        }
    }


    public static void main()throws Exception
    {
        Anagram ob=new Anagram();
        ob.input();
    }
}
