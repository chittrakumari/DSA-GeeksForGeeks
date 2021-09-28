import java.util.ArrayList;

public class MatrixInSnakePattern {
      static ArrayList<Integer> snakePattern(int matrix[][])
        {
            // code here
            ArrayList<Integer> ans=new ArrayList<>();
            for (int i = 0; i < matrix.length; i++) {
                if(i%2==0) {
                    ArrayList<Integer> ans1=new ArrayList<Integer>();
                    for (int j = 0; j < matrix.length; j++) {
                        ans.add(matrix[i][j]);
                    }
                }
                else{
                    for (int j = matrix.length-1; j>=0; j--) {
                        ans.add(matrix[i][j]);
                    }
                }
                System.out.println();
            }

            return ans;
        }

    public static void main(String[] args) {
        MatrixInSnakePattern obj=new MatrixInSnakePattern();
        int[][] arr= {{45, 48, 54},
            {21, 89, 87},
            {70, 78, 15}};
                obj.snakePattern(arr);
    }
}
