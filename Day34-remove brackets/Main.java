import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the expression");
        String str = sc.nextLine();
        String remove = " ";
        remove = str.replaceAll("[(){}]", "");
        System.out.println(remove);
    }
}