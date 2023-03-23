import java.util.*;


public class Main {

    public static boolean equal (int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            while (arr[i]%2==0)
            arr[i] /=2;

            while (arr[i]%3==0)
            arr[i] /=3;
        }

        for(int i=1;i<n;i++)
        
            if(arr[i]!=arr[0])
            {
                return false;
            }
            return true;
        
    }  
    
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();

    System.out.println("enter the array elements : ");
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }

    if(equal(arr,n))
    {
        System.out.println("yes");
    }
   
    else
    {
        System.out.println("no");
    }           
       
    }
}
