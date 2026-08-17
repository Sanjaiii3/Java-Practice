import java.util.*;

class SumbetweenZeros {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    };

    public static ListNode mergeNodes(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        ListNode temp = head;

        int sum = 0;

        while (temp != null) {

            if (temp.val != 0) {
                sum += temp.val;
            }
            else {
                ans.next = new ListNode(sum);
                ans = ans.next;
                sum = 0;
            }

            temp = temp.next;
        }

        return dummy.next.next;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        ListNode result = mergeNodes(head);

        System.out.println("Result:");

        ListNode temp = result;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}