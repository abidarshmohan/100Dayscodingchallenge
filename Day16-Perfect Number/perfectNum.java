import java.util.Scanner;

public class perfectNum{
    public static void main(String[] args) {
    
         Scanner sc =new Scanner(System.in);
         System.out.println("enter the number");
         int num = sc.nextInt();
         int i=1, sum=0;
         while( i<num)
            {
                if(num%i==0)
                {
                    sum=sum +i;            
                }
                i++; 
                
            }
            if(num == sum )
            {
                System.out.println("Perfect Number");
            }
            else{
                System.out.println("Not a Perfect number");
            }
             
        }
}