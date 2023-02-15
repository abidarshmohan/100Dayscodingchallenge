
import java.io.*;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");
        String str = sc.nextLine();
        String rev="";

        char ch[]=str.toCharArray();
        int len =ch.length; 
        for(int i =len-1;i>=0;i--)
        {
            rev=rev+ch[i];
        }
        System.out.println(rev);
    }
}
