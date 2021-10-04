import java.util.HashSet;

public class UnionOfTwoArrays {
    public static int doUnion(int a[], int n, int b[], int m)
    {

        HashSet h1=new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            h1.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            h1.add(b[i]);
        }
        return h1.size();
    }
}
