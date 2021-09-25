/*
Q.Move all zeroes to end of array

Given an array arr[] of N positive integers. Push all the zero’s of the given array to the right
 end of the array while maitaining the order of non-zero elements.


Example 1:

Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements
preserve their order while the 0
elements are moved to the right.
Example 2:

Input:
N = 4
Arr[] = {0, 0, 0, 4}
Output: 4 0 0 0
Explanation: 4 is the only non-zero
element and it gets moved to the left.

Your Task:
You don't need to read input or print anything. Complete the function pushZerosToEnd() which takes the array arr[] and its size n as input parameters and modifies arr[] in-place such that all the zeroes are moved to the right.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 105
0 ≤ arri ≤ 105

 */











import java.util.Arrays;

public class MoveAllZeroesToTheEndOfArray {

        void pushZerosToEnd(int[] arr, int n) {
            // code here
            int t;
            int count=0;
            // code here
            for(int i=0;i<n;i++){
                if(arr[i]!=0){
                    t=arr[i];
                    arr[i]=arr[count];
                    arr[count]=t;
                    count=count+1;
                }

            }
            System.out.println(Arrays.toString(arr));


        }

    public static void main(String[] args){
MoveAllZeroesToTheEndOfArray obj=new MoveAllZeroesToTheEndOfArray();
int[] ans={3,5,0,0,4};
obj.pushZerosToEnd(ans,5);

    }
}
