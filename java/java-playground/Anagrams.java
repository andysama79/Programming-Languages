import java.util.Locale;
import java.util.Scanner;
public class Anagrams {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase(Locale.ROOT);
        String b=sc.next().toLowerCase(Locale.ROOT);
        if(a.length()>=1 && a.length()<=50 && b.length()>=1 && b.length()<=50 && a.length()==b.length()){
            boolean ans=isAnagram(a,b);
            if(ans){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
    }
    public static boolean isAnagram(String a, String b){
        boolean ans=true;
        char[] ar=sort(a.toLowerCase().toCharArray());
        char[] br=sort(b.toLowerCase().toCharArray());

            for(int i=0;i<a.length();i++){
                if(ar[i]!=br[i]){
                    ans=false;
                    break;
                }
            }
            return ans;
    }
    public static char[] sort(char[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if((int)arr[i]>(int)arr[j]){
                    char temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
