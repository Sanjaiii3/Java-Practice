import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // array size
        int[] arr = new int[n];

        // array input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for(int i : arr){
            if(i > fl){
                sl = fl;
                fl = i;
            }
            else if(i != fl && i > sl){
                sl = i;
            }
        }

        if(sl == Integer.MIN_VALUE){
            System.out.println(-1);
        } else {
            System.out.println(sl);
        }

        sc.close();
    }
}