import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n = sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i]*arr[i];
        }
        System.out.println("Sum of square of positive numbers are : "+sum);
       
    }
}