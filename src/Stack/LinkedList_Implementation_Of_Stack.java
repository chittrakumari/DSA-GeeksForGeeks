package Stack;

public class LinkedList_Implementation_Of_Stack {
    Node head;
    int top;
    int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public  boolean push(int data){
        Node new_node=new Node(data);



          new_node.next=head;
          head=new_node;

top=top+1;
size=size+1;
        return true;
    }
    public  int pop(){
        if(top==-1){
            return -1;
        }
        else{
            int result=head.data;
           head=head.next;
            top=top-1;
size--;

            return result;
        }
    }
    public  int peek(){
        if(top==-1){
            return -1;
        }
        else{


            return head.data;
        }
    }
    public  boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{


            return false;
        }
    }
    public  int size(){
        return top+1;
    }

    public static void main(String[] args) {
        LinkedList_Implementation_Of_Stack s=new LinkedList_Implementation_Of_Stack();
        System.out.println(s.push(10));

        System.out.println(s.push(20));
        System.out.println(s.push(30));
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
