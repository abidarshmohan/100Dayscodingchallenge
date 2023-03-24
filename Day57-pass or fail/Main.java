import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
      int n;
      System.out.println("enter the number of test cases: "); 
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt(); 

      int t[]=new int[n];
      int c[]=new int[n];
      int m[]=new int[n];
      System.out.println("enter the marks");
      for(int i=0;i<n;i++)
      {
        t[i]=sc.nextInt();
        c[i]=sc.nextInt();
        m[i]=sc.nextInt();
        System.out.println("***************");
      }

      for(int i=0;i<n;i++)
      {
        if(((c[i]*4)-t[i])>=m[i])
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
      
      }
    }
}