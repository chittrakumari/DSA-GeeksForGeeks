import java.util.Scanner;

public class SumOfNNaturalNumbersUsingRecursion {
    public long sum(long n){
        if(n==1){
            return 1;
        }
        return (n+sum(n-1))%(1000000000+7);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        SumOfNNaturalNumbersUsingRecursion obj=new SumOfNNaturalNumbersUsingRecursion();
        for (int i = 0; i < t; i++) {
            long n=sc.nextLong();
            System.out.println(obj.sum(n));
        }
    }
}
