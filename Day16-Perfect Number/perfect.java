
import java.util.Scanner;

public class perfect{
    public static void main(String[] args) {
    
         Scanner sc =new Scanner(System.in);
         System.out.println("enter the number");
         int num = sc.nextInt();
         int i, sum=0;
         for(i=1;i<num;i++)
            {
                if(num%i==0)
                {
                    sum=sum +i;            
                }
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
