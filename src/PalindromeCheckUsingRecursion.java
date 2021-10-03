import java.util.Scanner;

public class PalindromeCheckUsingRecursion {
    boolean PalindromeCheckUsingRecursion(String str){
        int start = 0;
        int end=str.length()-1;
        while(str.charAt(start)==str.charAt(end)){

            start=start+1;
            end=end-1;

            if(start>=end){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();

    PalindromeCheckUsingRecursion obj=new PalindromeCheckUsingRecursion();
        System.out.println(obj.PalindromeCheckUsingRecursion(a));
    }
}
