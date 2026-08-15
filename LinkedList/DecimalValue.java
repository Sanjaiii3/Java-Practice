import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
};

public class DecimalValue {

    public static int getDecimalValue(ListNode head) {

        int ans = 0;
        ListNode temp = head;

        while (temp != null) {
            ans = ans * 2 + temp.val;
            temp = temp.next;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Decimal value: 0");
            return;
        }

        System.out.println("Enter binary values:");

        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        int result = getDecimalValue(head);

        System.out.println("Decimal value: " + result);
    }
}