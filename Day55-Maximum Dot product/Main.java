import java.util.Scanner;

public class Main {
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

        //sort 
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }

        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr2[i]>arr2[j])
                {
                    int temp=arr1[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }

        int product =0;
        for(int i=0;i<size;i++)
        {
            product+=arr1[i]*arr2[i];
        }

        System.out.println(product);

    }

}
