import java.util.Scanner;
public class OutputFormattingI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("================================");
        logic(s);
        logic(s1);
        logic(s2);
        System.out.println("================================");
    }
    public static void logic(String s) {
        String[] arr = s.split(" ");
        String s1 = arr[0];
        String s2= arr[1];
        int n = Integer.parseInt(s2);
        System.out.print(s1);
        for (int i = 0; i < 15 - s1.length(); i++) {
            System.out.print(" ");
        }
        if(arr[1].length()==1)
            System.out.println("00"+n);
        else if(arr[1].length()==2)
            System.out.println("0"+n);
        else
            System.out.println(n);

    }
}
