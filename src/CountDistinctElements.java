/*
Q.You are given an array Arr of size N. Find the sum of distinct elements in an array.

Example 1:

Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 5
Explanation: Distinct elements are 1, 2, 3
4, 5. So o/p 5.
*/




import java.util.HashSet;

public class CountDistinctElements {

    int distinctElements(int[] arr){

                HashSet<Integer> al=new HashSet<Integer>();
                int c=0;
                for (int i = 0; i < arr.length; i++) {

                    if(al.add(arr[i])){
                        c=c+1;
                    }

                }

                return c;
            }




    public static void main(String[] args) {
    CountDistinctElements obj=new CountDistinctElements();
    int[] arr={10,6,9,6,9,6,8,7};
    int ans=obj.distinctElements(arr);
        System.out.println(ans);
    }
}
