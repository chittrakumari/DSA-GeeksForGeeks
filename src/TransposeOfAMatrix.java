import java.util.Arrays;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};

            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    int t = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = t;

                }
                //System.out.println();
            }
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }


        }
    }
