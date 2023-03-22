import java.util.Scanner;

public class disjoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size : ");
        int size = sc.nextInt();

        System.out.println("enter the elements for first array: ");
        int arr1[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter the array size : ");
        int size2 = sc.nextInt();
        System.out.println("enter the elements for second array: ");
        int arr2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("**********************\n");
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = true;
                    break;
                }

            }
        }

        if (!flag) {
            System.out.println(" Disjoint");
        } else {
            System.out.println("not disjoint");

        }

    }
}
