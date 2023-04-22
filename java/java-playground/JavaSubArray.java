import java.util.*;
import java.io.*;
import java.util.stream.IntStream;


public class JavaSubArray {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        sc.nextLine();
        String input=sc.nextLine();
        int[] arr;
        String[] str=input.split(" ");
        arr = IntStream.range(0, n).map(i -> Integer.parseInt(str[i])).toArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int[] sub=new int[j+1];
                if (j + 1 - i >= 0) System.arraycopy(arr, i, sub, i, j + 1 - i);
                if(sumArray(sub)<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static int sumArray(int[] arr){
        int sum=0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
