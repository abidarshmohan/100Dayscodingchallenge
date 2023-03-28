import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
public static void main (String[] args)
{
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 for(int i=0;i<t;i++){
 int w1=sc.nextInt();
 int w2=sc.nextInt();
 int x1=sc.nextInt();
 int x2=sc.nextInt();
 int m=sc.nextInt();
 System.out.println("********");
 if((w2>=w1+(x1*m))&&(w2<=w1+(x2*m)))
 System.out.println("1\n");
 else
 System.out.println("0\n");
 
 }
}
}