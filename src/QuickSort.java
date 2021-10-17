import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr,int start,int end){
        int pivot=arr[end];
        int partion_Index=start;
        for (int i = start; i < end; i++) {
            if(arr[i]<=pivot){
                int t=arr[partion_Index];
                arr[partion_Index]=arr[i];
                arr[i]=t;
                partion_Index++;
            }
        }
        int t=arr[partion_Index];
        arr[partion_Index]=arr[end];
        arr[end]=t;
        return partion_Index;
    }
    public static int[] quicksort(int[] arr,int start,int end){
        if(start<end) {
            int partion_Index = partition(arr, start, end);
            quicksort(arr, start, partion_Index - 1);
            quicksort(arr, partion_Index + 1, end);
        }
        return arr;
    }
    public static void main(String[] args) {
        QuickSort obj=new QuickSort();
        int[] arr={12,9,99,4,90};
        int[] ans=obj.quicksort(arr,0,4);
        System.out.println(Arrays.toString(ans));
    }
}
