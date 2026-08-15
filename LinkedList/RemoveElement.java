import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
};

public class RemoveElement {

    public static ListNode removeElements(ListNode head, int val) {

        // Remove matching elements from the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode temp = head;

        // Remove matching elements from the remaining list
        while (temp != null && temp.next != null) {

            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } 
            else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Enter elements:");

        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        head = removeElements(head, val);

        // Print linked list
        System.out.print("After removing " + val + ": ");

        temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}//GitHub contribution test
