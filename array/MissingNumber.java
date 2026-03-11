import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size of array
        int[] arr = new int[n];

        // array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long sum = 0;
        long totalN = arr.length + 1;
        long tsum = totalN * (totalN + 1) / 2;

        for (int nums : arr) {
            sum += nums;
        }

        int result = (int)(tsum - sum);
        System.out.println(result);
    }
}

 
