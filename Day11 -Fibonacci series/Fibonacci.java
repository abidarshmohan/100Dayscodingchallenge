import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int first = 0, sec=1 ,third;
        System.out.println("Enter the number");
        int num =  sc.nextInt();
        System.out.println("\n"+first );
        System.out.println(sec);
        for(int i=3;i<=num ;i++)
        {
            third=first+sec;
            System.out.println(third);
            first=sec;
            sec=third;
        }

    }
    
}
