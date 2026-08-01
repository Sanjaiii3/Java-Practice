import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int candydistribute(int arr[], int m) {
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            min = Math.min(min, diff);
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of packets: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter chocolates in each packet:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number of students
        System.out.print("Enter number of students (m): ");
        int m = sc.nextInt();

        int ans = candydistribute(arr, m);

        System.out.println("Minimum Difference = " + ans);

        sc.close();
    }
}