import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of test cases : ");
        int t=sc.nextInt();
        int k,x;
        for(int i=0;i<t;i++)
        {
            System.out.println("\nenter the total capacity : ");
            k =sc.nextInt();

            System.out.println("enter the amount of litres present :");
            x =sc.nextInt();

            int maxAmount=k-x;
            System.out.println("\nThe maximum amount of extra water in liters : "+maxAmount);

        }
        
        
        

     
    }
}
