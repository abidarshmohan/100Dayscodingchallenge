import java.util.Scanner;

public class add{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int num =  sc.nextInt();
        num=(num*(num+1))/2;
        System.out.println(num);
    }
    
}