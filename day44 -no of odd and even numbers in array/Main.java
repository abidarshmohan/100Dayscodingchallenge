import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new  Scanner (System.in);
        System.out.println("enter the array size : ");
        int arrSize =sc.nextInt();
         
        System.out.println("enter the elements");
        int[] arr= new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0,flag=0;
        for(int i=0;i<arrSize;i++)
        {
          if(arr[i] %2 ==1)
          count++;
          else
          flag++;
            
        }
       
            System.out.println("no of even numbers : "+flag);
    
    
    
        System.out.println("no of odd numbers : "+count);
    
  
    }    
        

    }
