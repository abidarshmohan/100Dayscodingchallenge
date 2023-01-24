import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month : ");
        int month=sc.nextInt();
        System.out.println("Enter the year : ");
        int year=sc.nextInt();
        if(month==2 && year%4==0 && year%4==0)
        {
            System.out.println("29 Days");
        }
        else if (month==2)
        {
            System.out.println("28days");
        }
       else if(month==1 || month==3 || month==5 || month==7 ||month==8 ||month==10|| month==12  )
        {
            System.out.println("31 Days");
        }
       else
        {
            System.out.println("30 Days");
        }
    }
    
}
