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
        public Node pairwiseSwap(){
            if(head==null || head.next==null){
                return head;
            }
            Node curr=head;
            while(curr!=null){
                if(curr.next!=null && curr!=null ) {
                    int t = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = t;

                }
                else{
                    return head;
                }
                if(curr.next.next!=null && curr.next!=null && curr!=null){
                    curr=curr.next.next;
                }
                else{
                    return head;
                }

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
        public Node sortedduplicates(){
            if(head==null || head.next==null){
                return head;
            }
            Node curr=head;
            Node next=head;
            Node prev=null;
            while(curr.next!=null){
                int f=0;
                if(curr.data==next.data) {
                    while (curr.data == next.data && next != null) {
                        f=1;
                        next = next.next;
                    }
                    if(f==1){
                        prev.next=next;
                    }
                }
            else{
                    prev=curr;
                    curr=curr.next;
                    next=curr.next.next;
                }
            }
            return head;
    }



    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.insert(5);
        obj.insert(55);
        obj.insert(85);
        obj.insert(85);
        obj.insert(43);
        obj.traversal();
        obj.sortedduplicates();
        obj.traversal();

    }


}
