import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws java.lang.Exception{
        Scanner sc =new Scanner(System.in);
        int k;
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int sum0=0,sum1=0;
            for(int j=0;j<7;j++)
            {
                
                k=sc.nextInt();
                if(k==1)
                {
                    sum1++;
                }
                else{
                    sum0++;
                }
            }
        
            System.out.println("********");
            if(sum0>=sum1)
            {
                System.out.println("\nNO");
            }
            else{
                System.out.println("\nYES");
            }
        }
    }
}
