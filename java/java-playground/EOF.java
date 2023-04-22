import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EOF {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int i=1;
        while(sc.hasNext()){
            System.out.println(i+" "+sc.nextLine());
            i++;
        }
    }
}
