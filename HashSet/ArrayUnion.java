package HashSet;
import java.util.*;

public class ArrayUnion {

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {

        ArrayList<Integer> list = new ArrayList<>();

        int[] ans = new int[a.length + b.length];
        int ind = 0;

        for (int i = 0; i < a.length; i++) {
            ans[ind++] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            ans[ind++] = b[j];
        }

        Arrays.sort(ans);

        HashSet<Integer> set = new HashSet<>();

        for (int x : ans) {
            if (!set.contains(x)) {
                list.add(x);
                set.add(x);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] b = new int[m];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = findUnion(a, b);

        System.out.println("Union of the arrays:");
        for (int x : ans) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}