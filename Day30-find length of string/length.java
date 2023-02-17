import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class length {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        int count=0;
        char ch[]=str.toCharArray();
       for(char c : ch)
        {
            count++;
        }
        System.out.println(count);
    }
}
