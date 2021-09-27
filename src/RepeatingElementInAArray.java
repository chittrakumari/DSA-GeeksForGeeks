/*
Q.Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n]
inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
*/


public class RepeatingElementInAArray {
    public int findDuplicate(int[] arr) {
        int slow=arr[0];
        int fast=arr[0];
        do{

            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);
        fast=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        RepeatingElementInAArray obj=new RepeatingElementInAArray();
        int arr[]={1,3,4,2,2};
        int ans= obj.findDuplicate(arr);
        System.out.println(ans);
    }
}
