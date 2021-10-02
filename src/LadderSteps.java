import java.util.Scanner;

public class LadderSteps {
    public static void main(String[] args) {
        int i=1;
        int a=0;
        int b=0;
        int c = 0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){


            a=b% (1000000000+7);
            b=c% (1000000000+7);
c=(a+b)% (1000000000+7);

            b++;
            i++;
        }
        System.out.println((c+1)% (1000000000+7));
    }
}
