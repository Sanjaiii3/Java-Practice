import java.util.*;

public class Main {

    public static int longestUniqueSubstr(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int l = 0;

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(l));
                l++;
            }

            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            }

            max = Math.max(max, i - l + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string
        String s = sc.nextLine();

        // Call function and print result
        int ans = longestUniqueSubstr(s);
        System.out.println(ans);

        sc.close();
    }
}

 
 
 
 

 

 
 
 
 

 

 
 

 
 

 
 

 

 
 
