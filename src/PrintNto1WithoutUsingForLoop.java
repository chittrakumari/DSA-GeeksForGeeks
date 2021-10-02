import java.util.Scanner;

public class PrintNto1WithoutUsingForLoop {
    public void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }

    public static void main(String[] args) {
        PrintNto1WithoutUsingForLoop obj=new PrintNto1WithoutUsingForLoop ();
        Scanner sc=new Scanner(System.in);
        obj.print(sc.nextInt());

    }
}
