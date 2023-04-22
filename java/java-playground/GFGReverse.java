import java.util.Scanner;
class GFGReverse
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for ( int j = 0 ; j < t; j++ ) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            String str = sc.nextLine();
            String[] st = str.split(" ");
            for ( int i = 0 ; i < n; i++ ){
                arr[i] = sc.nextInt();
            }

            for ( int i = n-1 ; i >=0; i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}