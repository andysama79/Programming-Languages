import java.util.*;
import java.io.*;

class LoopsI{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int c=0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if(a>=0 && b>=0 && a<=50 && b<=50 && n>=1 && n<=15){
                int s=a+b;
                System.out.print(s+" ");
                //s=s+2*b;
                //System.out.print(s+" ");
                //b=b*2;
                for(int j=2;j<=n;j++)
                {
                    b=b*2;
                    c=b;
                    s=s+c;
                    System.out.print(s+" ");
                }
                System.out.println();
            }
        }
        in.close();
    }
}