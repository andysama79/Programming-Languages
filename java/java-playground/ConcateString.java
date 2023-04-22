import java.io.*;
import java.util.*;


public class ConcateString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        if(isStringLowerCase(A) && isStringLowerCase(B)){
            System.out.println(A.length() + B.length());
            if (B.compareTo(A) >= 0) {
                System.out.println("No");
            }

            String c = A + " " + B;
            String srr[] = c.split(" ");
            for (int i = 0; i < srr.length; i++) {
                logic(srr[i]);

            }
        }
    }
    public static void logic(String s){
        char arr[]=s.toCharArray();
        arr[0]= Character.toUpperCase(arr[0]);
        String str=String.valueOf(arr);
        System.out.print(str+" ");
    }
    public static boolean isStringLowerCase(String str){


        char[] charArray = str.toCharArray();

        for(int i=0; i < charArray.length; i++){



            if( Character.isUpperCase( charArray[i] ))
                return false;

        }

        return true;

    }
}




