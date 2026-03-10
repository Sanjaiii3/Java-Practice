import java.util.*;

class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s1 = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            s1.add(nums[i]);
        }

        return s1.size() != nums.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size.
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = hasDuplicate(nums);

        System.out.println("Contains duplicate: " + result);
    }
}
