import java.util.*;
public class dotProduct{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();

        int arr1[]=new int[n];
        System.out.println("enter the elements for array1: ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }

        int arr2[]=new int[n];
        System.out.println("enter the elements for array2: ");
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }

        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    int temp =arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
                
            }
        } 

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr2[i]<arr2[j])
                {
                    int temp =arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
                
            }
        }

        int product=0;
        for(int i=0;i<n;i++)
        {

            product+= arr1[i]*arr2[i]; 
        }
        System.out.println(product);


    }
}