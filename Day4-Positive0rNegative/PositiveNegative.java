import java.util.Scanner;
import java.util.*;

public class PositiveNegative {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value ");
    int a = sc.nextInt();
    if(a<0)
    {
        System.out.println("Negative Number");
    }
    else if (a>0)
    {
        System.out.println("Positive Number");
    }
    else
    {
        System.out.println("Neither Positive Nor Negative");
    }
 }
}
