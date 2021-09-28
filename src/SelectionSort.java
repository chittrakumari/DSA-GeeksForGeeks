/*
Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.
*/

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 8, 9, 3, 5,6};
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j <arr.length ; j++)
                if(arr[j]<arr[min]){
                    min=j;
                }

                int t=arr[min];
                arr[min]=arr[i];
                arr[i]=t;


        }
        System.out.println(Arrays.toString(arr));
    }
}
