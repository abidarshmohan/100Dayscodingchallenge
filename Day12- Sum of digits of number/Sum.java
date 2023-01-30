import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int n1,t,n2,n3,sum;
         n1=num%10;
         t =num /10;
         n2= t%10;
         n3=t/10;
         sum = n1+n2+n3;
        System.out.println( sum);
      
    }
}

