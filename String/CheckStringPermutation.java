import java.util.Scanner;

public class CheckStringPermutation{

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        // Frequency of first window in s2
        for (int i = 0; i < s1.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        if (match(freq1, freq2)) {
            return true;
        }

        // Sliding Window
        for (int i = s1.length(); i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - s1.length()) - 'a']--;

            if (match(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }

    public static boolean match(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = sc.next();

        System.out.print("Enter s2: ");
        String s2 = sc.next();

        boolean ans = checkInclusion(s1, s2);

        System.out.println(ans);

        sc.close();
    }
}
