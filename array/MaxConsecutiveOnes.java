import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of array
        int[] nums = new int[n];

        // taking array input
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}










