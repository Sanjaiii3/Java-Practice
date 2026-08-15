import java.util.*;

public class FormLongestPalindromeSize {

    public static int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int even = 0;
        int oddmax = 0;

        // Check frequencies
        for (char ch : map.keySet()) {

            if (map.get(ch) % 2 == 0) {
                even += map.get(ch);
            } 
            else {
                even += map.get(ch) - 1;
                oddmax = 1;
            }
        }

        return oddmax + even;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = longestPalindrome(s);

        System.out.println("Longest palindrome length: " + result);
    }
}
