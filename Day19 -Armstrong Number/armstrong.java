
import java.util.Scanner;
public class armstrong
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int result=0;
        int count=0;
        int rem;
        while (num != 0)
        {
            num /= 10;
            count++;
        }
        num = temp;

        while (num != 0)
        {
            rem = num%10;
            int mul=1;
            for(int i=1;i<=count;i++) 
            {
            mul=mul*rem;
            }
            result=result+mul;
            num /= 10;
        }
            if(result==temp)
            {
                System.out.println("is Armstrong Number");
            }
            else
            {
                System.out.println("Not Armstrong Number");
            }
    }
}
