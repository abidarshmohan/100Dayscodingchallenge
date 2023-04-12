import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t-->0)
        {

            int n=sc.nextInt();
            int m=sc.nextInt();

            if(n%2==0&&m%2==0)
            {
                System.out.println(0+"\n");
            }
            else if(n%2==0&&m%2!=0)
            {
                System.out.println(n+"\n");
            }
            else if(n%2!=0&&m%2==0)
            {
                System.out.println(m+"\n");
            }
            else
            {
                System.out.println(m+n-1+"\n");
            }
        }
    }
}