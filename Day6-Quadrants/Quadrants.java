import java.util.*;
public class Quadrants {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter x: ");
        int x=sc.nextInt();
        System.out.println("enter y: ");
        int y=sc.nextInt();
        if(x>0 && y>0)
        {
            System.out.println("This point lies in first quadrant\n");
        }
        else if(x<0 && y>0)
        {
            System.out.println("This point lies in Second quadrant\n");
        }
        else if(x<0 && y<0)
        {
            System.out.println("This point lies in Third quadrant\n");
        }
        else
        {
            System.out.println("This point lies in fourth quadrant\n");
        }


    }
}
