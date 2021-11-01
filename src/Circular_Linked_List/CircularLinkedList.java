package Circular_Linked_List;

public class CircularLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next=null;
        }
    }

    void traversal(Node head){
        if(head==null){
            System.out.print("");
        }
        else if(head.next==head){
            System.out.print(head.data);
        }
        else {
            Node current=head;
            System.out.print(head.data+" ");
            head=head.next;
            while(current!=head){
                System.out.print(head.data+" ");
                head=head.next;
            }
        }

    }

    public static void main(String[] args) {
       CircularLinkedList obj=new CircularLinkedList();
     Node head=new Node(10);
     head.next = new Node(20);
        head.next.next=head;
   obj.traversal(head);
    }
}
