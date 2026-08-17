import java.util.*;

class insertGcd {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    };

    public static ListNode insertGreatestCommonDivisors(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode temp1 = head;
        ListNode temp2 = temp1.next;

        while (temp2 != null) {

            int a = temp1.val;
            int b = temp2.val;

            // Find GCD
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            // Create GCD node
            ListNode ans = new ListNode(a);

            // Insert GCD node
            temp1.next = ans;
            ans.next = temp2;

            // Move to next pair
            temp1 = temp2;
            temp2 = temp2.next;
        }

        return head;
    }

    static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
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
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        head = insertGreatestCommonDivisors(head);

        System.out.println("Final List:");
        printList(head);
    }
}