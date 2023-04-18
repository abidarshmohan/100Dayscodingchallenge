import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int count=0,flag=0;
            int n=sc.nextInt();
            String s=sc.next();

            for(int j=0;j<s.length()-1;j++)
            {
                if(s.charAt(j)=='1')
                {
                    count++;
                    if(s.charAt(j)==s.charAt(j+1))
                    flag++;
                }
            }
            if(s.charAt(s.length()-1)=='1' &&count==0)
            {
                System.out.println('1');
                continue;
            }
            if(count==0)
            {
                System.out.println('0');
            }
            else
            {
                if(flag==0)
                {
                    System.out.println('1');
                }
                else
                {
                    System.out.println('2');
                }
            }
        }
    }
}