import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Radius: ");
    int radius =sc.nextInt();
    float area = 3.14f*radius*radius;
      System.out.println(area);
    }
}
