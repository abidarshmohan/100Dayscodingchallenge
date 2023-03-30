import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T= sc.nextInt();
        int temp=0;
        for(int i =0;i<T;i++)
        {
            int N=sc.nextInt();
            int B=sc.nextInt();
            
            for(int j=0;j<N;j++)
            {
                int wi =sc.nextInt();
                int hi=sc.nextInt();
                int pi=sc.nextInt();
                
                if(pi<=B)
                if(wi*hi>temp){
                    {
                        temp = wi*hi;
                    }
                }
               
                
            }
        }
        System.out.println("**********");
        if(temp!=0)
        {
            System.out.println(temp);
        }
        else{
            System.out.println("no tablet");
        }

        
    }
}
