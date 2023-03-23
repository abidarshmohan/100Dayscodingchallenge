import java.util.Scanner;
import java.util.Arrays;

public class dotProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();

        int arr1[]=new int[size];
        System.out.println("enter the array elements: ");
        for(int i=0;i<size;i++)
        {
            arr1[i]=sc.nextInt();
        }

        int arr2[]=new int[size];
        System.out.println("enter the array elements: ");
        for(int i=0;i<size;i++)
        {
            arr2[i]=sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int product =0;
        for(int i=0;i<size;i++)
        {
            product+=arr1[i]*arr2[i];
        }

        System.out.println(product);
    }
}