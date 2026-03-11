import java.util.*;

public class ReplaceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        for(int i = 0; i < arr.length; i++) {
            int max = -1;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }

        // Output
        System.out.println("Result array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



