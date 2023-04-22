import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(A.length()<=50 && isStringLowerCase(A)){
            String rev="";
            for(int i=A.length()-1;i>=0;i--){
                rev=rev+A.charAt(i);
            }
            System.out.println(rev);
            if(rev.equals(A)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

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



