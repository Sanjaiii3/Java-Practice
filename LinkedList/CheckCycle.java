import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
};

public class CheckCycle {

    public static boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Cycle: false");
            return;
        }

        // Create first node
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        // Create remaining nodes
        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        // Store last node
        ListNode last = temp;

        System.out.print("Enter position to create cycle (-1 for no cycle): ");
        int pos = sc.nextInt();

        // Create cycle
        if (pos != -1) {
            temp = head;

            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }

            last.next = temp;
        }

        System.out.println("Cycle: " + hasCycle(head));
    }
}