class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
};

public class removeHeadTail {
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
        head=removehead(head);
        temp=head;
        while(temp!=null){

        System.out.print(temp.data+" ");
        temp=temp.next;
        }
        System.out.println();
        head=removetail(head);
        temp=head;
        while(temp!=null){
                 System.out.print(temp.data+" ");
                 temp=temp.next;
        }
        System.out.println();
    
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
    private static Node removehead(Node head){
        if(head==null){
            return null;
        }
            head=head.next;
        
        return head;
    }
    private static Node removetail(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}