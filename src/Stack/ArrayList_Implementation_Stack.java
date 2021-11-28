package Stack;

import java.util.ArrayList;

public class ArrayList_Implementation_Stack {

    ArrayList<Integer> al = new ArrayList<>();
    int top;
    ArrayList_Implementation_Stack(){
        top=-1;

    }

    public  boolean push(int data){


            top=top+1;
            al.add(data);
            return true;
        }

    public  int pop(){
        if(top==-1){
            return -1;
        }
        else{
            int result=al.get(top);

            al.remove(top);
            top=top-1;
            return result;
        }
    }
    public  int peek(){
        if(top==-1){
            return -1;
        }
        else{


            return al.get(top);
        }
    }
    public  boolean isEmpty(){
        if(al.isEmpty()){
            return true;
        }
        else{


            return false;
        }
    }
    public  int size(){
        return al.size();
    }

    public static void main(String[] args) {
        ArrayList_Implementation_Stack s=new ArrayList_Implementation_Stack();
        System.out.println(s.push(10));

        System.out.println(s.push(20));
        System.out.println(s.push(30));
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}

