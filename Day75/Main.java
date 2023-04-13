import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if(n%k==0)
            System.out.println(n/k+"\n");
            else
            System.out.println("-1\n");
        }
    }
}