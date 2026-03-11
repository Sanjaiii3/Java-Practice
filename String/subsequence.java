import java.util.*;

public class subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Manual input
        System.out.println("Enter string s:");
        String s = sc.nextLine();

        System.out.println("Enter string t:");
        String t = sc.nextLine();

        int i = 0;
        int j = 0;

        // Logic
        while (s.length() > i && t.length() > j) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        boolean result = (i == s.length());

        // Output
        System.out.println(result);
    }
}
