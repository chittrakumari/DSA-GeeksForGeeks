/*
Q.You are given an integer array nums. The unique elements of an array are the elements that appear
exactly once in the array.

Return the sum of all the unique elements of nums.



Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.

*/





import java.util.HashSet;
public class SumOfUniqueElements {
    public int sumOfUnique(int[] arr) {
        HashSet<Integer> al=new HashSet<Integer>();
        HashSet<Integer> al1=new HashSet<Integer>();
        int c=0;
        for (int i = 0; i < arr.length; i++) {

            if(al.add(arr[i])){
                c=c+arr[i];
            }
            else {
                if (al1.add(arr[i])) {
                    c = c - arr[i];
                }
            }
        }
        if(c>=0){
            return c;}
        return 0;

    }
}
