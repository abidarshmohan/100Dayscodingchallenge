import java.util.*;
public class Ascii {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value : ");
        
        char ch=sc.next().charAt(0);
        int ascii = ch;
        System.out.println(ascii);
    }
}
