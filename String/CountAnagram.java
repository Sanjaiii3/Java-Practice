import java.util.Scanner;

public class CountAnagram {

    public static int search(String pat, String txt) {

        int[] freq = new int[26];

        for (char ch : pat.toCharArray()) {
            freq[ch - 'a']++;
        }

        int count = 0;
        int k = pat.length();

        if (k > txt.length())
            return 0;

        int[] freq1 = new int[26];

        // First window
        for (int i = 0; i < k; i++) {
            freq1[txt.charAt(i) - 'a']++;
        }

        if (check(freq, freq1)) {
            count++;
        }

        // Sliding window
        for (int i = k; i < txt.length(); i++) {
            freq1[txt.charAt(i) - 'a']++;
            freq1[txt.charAt(i - k) - 'a']--;

            if (check(freq, freq1)) {
                count++;
            }
        }

        return count;
    }

    public static boolean check(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pattern: ");
        String pat = sc.next();

        System.out.print("Enter text: ");
        String txt = sc.next();

        int ans = search(pat, txt);

        System.out.println("Number of anagrams = " + ans);

        sc.close();
    }
}
   

