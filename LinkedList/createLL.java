class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
};
public class createLL{
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,7,8,9};
        Node head=arraytolist(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
        int lengthOfLL=length(head);
        System.out.print("length of linked list:"+lengthOfLL);
    }
    private static Node arraytolist(int []arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static int length(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}