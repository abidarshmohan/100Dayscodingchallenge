import java.util.Scanner;


public class palindromeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();
        int rem,reverse=0;
        int temp=num;
        while(num!=0)
        {
            rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        
        }
        if(num==reverse)
        {
            System.out.println( "is a Palindrome");
        }
        else
        {
            System.out.println( "is not a Palindrome");
        }
    }
}
