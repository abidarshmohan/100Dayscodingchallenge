import java.util.Scanner;
import java.io.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++)
        {
         if(Character.isLowerCase(str.charAt(i)))
         {
           result=(String) (result+ Character.toUpperCase(str.charAt(i)));
         }
         else
         {
            result=(String)(result+Character.toLowerCase(str.charAt(i)));
         }
        }
        System.out.println(result);    
        
    }
}
