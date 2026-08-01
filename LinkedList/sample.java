public class sample{
    static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
Node head;
public static void main(String[] args) {
    sample list=new sample();
    list.head=new Node(10);
    list.head.next=new Node(20);
    list.head.next.next=new Node(30);
    list.printList();
}
void printList(){
    Node temp=head;
    while(temp!=null){
     System.out.print(temp.data+" ");
     temp=temp.next;
    }
    System.out.println("null");
}
public void insertAtBegining(int data){
    System.out.println("Insert at begining");
    Node newNode= new Node(data);
    newNode.next=head;
    head=newNode;
}
}