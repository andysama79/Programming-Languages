import java.util.*;
public class LocalizationDemo{
    public static void main(String[] args){
        Locale localeDefault = Locale.getDefault();
        System.out.println("Country:" + localeDefault.getDisplayCountry());
        System.out.println("Language:" + localeDefault.getDisplayLanguage());
        System.out.println("Language:" + localeDefault.getLanguage());
        System.out.println("Country:" + localeDefault.getCountry());
    }
}