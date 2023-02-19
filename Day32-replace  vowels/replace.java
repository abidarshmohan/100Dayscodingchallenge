import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        String replaceStr=" ";
        replaceStr=str.replaceAll("[aeiou]","");
        System.out.println(replaceStr);
    }
}
