import java.util.Scanner;
public class SubstringCompare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        sc.close();
        if(onlyAlpha(s) && s.length()>=1 && s.length()<=1000){
            String ans=getSmallestAndLargest(s,k);
            System.out.println(ans);
        }
    }
    public static boolean onlyAlpha(String s){
        return((s!=null) && (!s.equals(" ")) && s.matches("^[a-zA-Z]*$"));
    }

    public static String getSmallestAndLargest(String s, int k) {

        int p=k;
        String[] arr=new String[s.length()-k+1];
        for(int i=0;i<s.length()-k+1;i++){
            arr[i]=s.substring(i,p);
            p++;
        }

        String temp=" ";
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i].compareTo(arr[j]))>-1){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        String smallest = arr[0];
        String largest = arr[arr.length-1];
        return smallest + "\n" + largest;
    }
}
