
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String delimiter="[ .,!?_'@]+";//simple use of regex
        s=s.trim();
        if(s.length()>0){
            String[] arr=s.split(delimiter);
            System.out.println(arr.length);
            for (String value : arr) {
                System.out.println(value);
            }
        }
        else{
            System.out.println(0);
        }
        scan.close();
    }
}

