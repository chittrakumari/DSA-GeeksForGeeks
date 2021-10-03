/*
Given an array A[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all elements from 1 to N.


Example 1:

Input:
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1
*/
import java.util.HashMap;

public class FrequencyOfLimitedRangeArrayElements {
    public static void frequencyCount(int arr[], int N, int p)
    {
        // code here

        HashMap<Integer,Integer> h=new HashMap<>();
        int c=1;
        for (int i = 0; i < arr.length; i++) {


            if(h.containsKey(arr[i])){
                Integer r=h.get(arr[i])+1;
                h.put(arr[i],r);
            }
            else{
                h.put(arr[i],c);
            }
        }
        for(int i=0;i<N;i++){

            if(h.containsKey(i+1)){
                arr[i]=h.get(i+1);
            }
            else{
                arr[i]=0;
            }

        }
    }



    public static void main(String[] args) {
    int[] arr={2, 3, 2, 3, 5};
        frequencyCount(arr, 5, 5);
    }
}
