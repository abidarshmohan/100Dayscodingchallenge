import java.util.Scanner;

public class addFraction
{

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter the value for x1 and y1: ");

int x1=sc.nextInt();

int y1=sc.nextInt();

System.out.println("Enter the value for x2 and y2: ");

int x2=sc.nextInt();

int y2=sc.nextInt();

int temp;

int x3=(x1*y2)+(x2*y1);

int y3=y1*y2;

    if(x3>y3)
    {
        temp=y3;
    }
    else
    {
        temp=x3;
    }
    
        for(int i=temp;i>0;i--)
        {
        if(x3%i==0 && y3%i==0)
                {
                    x3=x3/i;
                    y3=y3/i;
                }
        }
        System.out.println(x3+"/"+y3); 
    }
}

