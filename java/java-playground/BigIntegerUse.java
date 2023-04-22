import java.math.BigInteger;
import java.util.*;
public class BigIntegerUse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a,b;
        BigInteger A,B,sum,product;
        a=sc.next();
        A=new BigInteger(a);
        b=sc.next();
        B=new BigInteger(b);
        if(a.length()<=200 && b.length()<=200){
            product=A.multiply(B);
            sum=A.add(B);
            System.out.println(sum+"\n"+product);
        }

    }
}
