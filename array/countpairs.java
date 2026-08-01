import java.util.Scanner;

public class countpairs {
    public static int countPairs(int arr[], int target) {
        int i = 0;
        int count = 0;

        while (i < arr.length) {
            int j = i + 1;

            while (j < arr.length) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
                j++;
            }

            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Count pairs
        int result = countPairs(arr, target);

        System.out.println("Number of pairs = " + result);

        sc.close();
    }
}