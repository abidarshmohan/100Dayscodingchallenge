import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int s=sc.nextInt();
            int w1=sc.nextInt();
            int w2=sc.nextInt();
            int w3=sc.nextInt();
            System.out.println("********");
            if((w1+w2+w3)<=s){
                System.out.println(1);
                }else if((w1+w2)<=s){
                System.out.println(2);
                }else if((w2+w3)<=s){
                System.out.println(2);
                }else{
                System.out.println(3);
                }
        }
    }
}