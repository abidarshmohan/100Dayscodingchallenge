import java.util.*;
public class Count {
    public static void main(String[] args) 
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int a=sc.nextInt();
	    while(a!=0)
        {
            a=a/10;
            count++;
        }	   
	    System.out.println("output : "+count);		
	}
}
    
