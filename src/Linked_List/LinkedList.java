package Linked_List;

public class LinkedList {
    private class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;

        }
    }
        private Node head;

        public Node insert(int data){
            Node new_node=new Node(data);
            if(head==null){
                head=new_node;
            }
            else{
                Node curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=new_node;
            }
            return head;
        }
        public Node reverse(){
            if(head==null){
                return null;
            }
            Node curr=head;
            Node prev=null;
            Node next=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
            head=prev;
            return prev;
        }
        public void traversal(){

            if(head==null){
                System.out.println("null");
            }
            else{
                Node curr=head;
                while(curr!=null){
                    System.out.print(curr.data+"->");
                    curr=curr.next;
                }
                System.out.println("null");
            }

        }


    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.insert(45);
        obj.insert(55);
        obj.insert(95);
        obj.insert(55);
        obj.insert(90);
        obj.traversal();
        obj.reverse();
        obj.traversal();
    }


}
