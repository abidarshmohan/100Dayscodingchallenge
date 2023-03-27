import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();

        
            if(a+b<3)
            {
                System.out.println("1");
                System.out.println("*********");
            }
            else if(3<=a+b && a+b<=10)
            {
                System.out.println("2");
                System.out.println("*********");
            }
            else if(11<=a+b && a+b<=60)
            {
                System.out.println("3");
                System.out.println("*********");
            }
            else if(60<a+b)
            {
                System.out.println("4");
                System.out.println("*********");
            }
        }
    }
}
