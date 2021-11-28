package Stack;

public class Array_Implementation_Stack {

    int size;
    int[] arr;
    int top;
    Array_Implementation_Stack(int size){
        top=-1;
        this.size=size;
        arr=new int[size];
    }

    public  boolean push(int data){
        if(size-1==top){
            return false;
        }
        else{
            top=top+1;
            arr[top]=data;
            return true;
        }
    }
    public  int pop(){
        if(top==-1){
            return -1;
        }
        else{
            int result=arr[top];
            top=top-1;
            size=size-1;

            return result;
        }
    }
    public  int peek(){
        if(top==-1){
            return -1;
        }
        else{


            return arr[top];
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
Array_Implementation_Stack s=new Array_Implementation_Stack(4);
        System.out.println(s.push(10));

        System.out.println(s.push(20));
        System.out.println(s.push(30));
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
