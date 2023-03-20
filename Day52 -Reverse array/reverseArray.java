import java.util.Scanner;

public class reverseArray {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the array size : ");
    int n =sc.nextInt();

    int arr[]=new int[n];
    System.out.println("enter the array elements : ");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }

    int i=0,j=n-1,temp;
    while(i<j)
    {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    System.out.println("reversed array");
    for( i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }


}
}
