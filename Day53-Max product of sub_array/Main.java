
import java.util.*;
public class Main
{
	static int maxProductSubArray(int arr[]) {
	    int result = Integer.MIN_VALUE;
	    for(int i=0;i<arr.length-1;i++) 
	        for(int j=i+1;j<arr.length;j++) {
	            int prod = 1;
	            for(int k=i;k<=j;k++) 
	                prod *= arr[k];
	            result = Math.max(result,prod);
	        }
	   return result;     
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the array size :");
	    int size =sc.nextInt();
	    
	    System.out.println("enter the array elements :");
	    int nums[]=new int[size];
	    for(int i=0;i<size;i++)
	    {
	        nums[i]=sc.nextInt();
	    }

		int answer = maxProductSubArray(nums);
		System.out.print("The maximum product subarray is: "+answer);
	}
}
