import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size: ");
        int arrSize=sc.nextInt();

        System.out.println("enter the array elements: ");
        int[] arr=new int[arrSize] ;
        for(int i=0;i<arrSize;i++)
        {
            arr[i]=sc.nextInt();
        }

       int small =arr[0];
       int large =arr[0];

       for(int i=1;i<arrSize;i++)
       {
         if(arr[i]>large)
        {
            large=arr[i];
        }
        else if(arr[i]<small)
        {
            small=arr[i];
        }
        
       }
       System.out.println("small :"+small);
       System.out.println("large :"+large);
    }
}