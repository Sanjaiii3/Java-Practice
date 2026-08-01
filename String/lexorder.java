
import java.util.*;
public class lexorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Character> lst=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            sc.nextLine();
            char ch=s.charAt(0);
             if(!lst.contains(ch)){
                lst.add(ch);
             }
        }
        for(char ch:lst){
            System.out.println(ch+" ");
        }
    }
}
import java.util.*;

public class lexorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Character> lst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char ch = s.charAt(0);

            if (!lst.contains(ch)) {
                lst.add(ch);
            }
        }

        for (char ch : lst) {
            System.out.print(ch + " ");
        }
    }
}import java.util.*;

public class lexorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Character> lst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char ch = s.charAt(0);

            if (!lst.contains(ch)) {
                lst.add(ch);
            }
        }

        for (char ch : lst) {
            System.out.print(ch + " ");
        }
    }
}import java.util.*;

public class lexorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Character> lst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char ch = s.charAt(0);

            if (!lst.contains(ch)) {
                lst.add(ch);
            }
        }

        for (char ch : lst) {
            System.out.print(ch + " ");
        }
    }
}