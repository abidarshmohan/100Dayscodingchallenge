import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arrSize=sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr=new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {
              arr[i]=sc.nextInt();
        }

        int sum=0;

        for(int i=0;i<arrSize;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}