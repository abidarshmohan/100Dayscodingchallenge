import java.util.*;
import java.lang.*;
import java.io.*;


public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int N=n/2;
            while(N>0&&a[N-1]==a[N])
            {
                N--;
            }
            
            System.out.println("*****\n"+(n-N)+"\n*****");
        }
    }
}