public class Print1ToNWithoutUsingLoop {
    public void printNos(int N)
    {
        if(N==0){
            return;
        }
        printNos(N-1);
        System.out.print(N+" ");//Your code here
    }


}
