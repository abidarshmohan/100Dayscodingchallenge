import java.io.*;
import java.util.Scanner;

public class concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first string : ");
        String str = sc.nextLine();
        System.out.print("enter the Second string : ");
        String str1 = sc.nextLine();
        System.out.println(str + str1);

    }
}