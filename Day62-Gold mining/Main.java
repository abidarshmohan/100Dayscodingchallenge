import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int carry = (N + 1) * Y;
            if (carry >= X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
