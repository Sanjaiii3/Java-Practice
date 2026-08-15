import java.util.*;

public class MaximumLengthSubstringWith2Occurrences {

    public static int maximumLengthSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            map.put(
                s.charAt(i),
                map.getOrDefault(s.charAt(i), 0) + 1
            );

            while (map.get(s.charAt(i)) > 2) {

                map.put(
                    s.charAt(left),
                    map.get(s.charAt(left)) - 1
                );

                left++;
            }

            max = Math.max(max, i - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = maximumLengthSubstring(s);

        System.out.println("Maximum length: " + result);
    }
}