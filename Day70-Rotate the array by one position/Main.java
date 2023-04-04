import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        // Store the last element of the array in a temporary variable
        int temp = arr[n-1];

        // Shift all the elements one position to the right
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        // Assign the last element to the first position of the array
        arr[0] = temp;

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
