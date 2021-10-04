/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the
result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/




import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoSortedArrays {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> h=new HashSet<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            h.add(arr1[i]);
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        int result=0;

        for (int i = 0; i < arr2.length; i++) {
            if(h.contains(arr2[i])){
                result=result+1;
                al.add(arr2[i]);
              h.remove(arr2[i]);
            }
        }
        int[] ans=new int[al.size()];
        for (int i = 0; i <al.size() ; i++) {
            ans[i]=al.get(i);
        }
        return ans;
    }
    public static void main(String[] args){
int arr1[]={1,2,2,1};
int arr2[]={2,2};
IntersectionOfTwoSortedArrays obj=new IntersectionOfTwoSortedArrays();
        int[] ans=obj.intersection(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
}
