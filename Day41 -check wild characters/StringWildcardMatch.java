import java.util.Scanner;
import java.util.regex.Pattern;

public class StringWildcardMatch {

    public static boolean match(String str1, String str2) {
        
        String regex = str2.replaceAll("\\*", ".*");
        
        return Pattern.matches(regex, str1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first string");
        String str1=sc.nextLine();
        System.out.println("enter the first string");
        String str2=sc.nextLine();

        if (match(str1, str2)) {
            System.out.println("Strings match");
        } else {
            System.out.println("Strings don't match");
        }
    }
}
