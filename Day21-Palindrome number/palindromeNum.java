import java.util.Scanner;
public class palindromeNum
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int rem,reverse=0;
int temp=num;
 while(num!=0)
 {
 rem=num%10;
 reverse=reverse*10+rem;
 num=num/10;
 }
 if(reverse==temp)
 System.out.println(temp+" is a Palindrome number");
 else
 System.out.println(temp+" is not a Palindrome number");
}
} 
