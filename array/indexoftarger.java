import java.util.*;

class indexoftarget{
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> lst = new ArrayList<>();
        int sum = 0;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            while (sum > target && start <= i) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                lst.add(start + 1);
                lst.add(i + 1);
                return lst;
            }
        }

        lst.add(-1);
        return lst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        ArrayList<Integer> result = subarraySum(arr, target);

        System.out.println(result);
    }
}