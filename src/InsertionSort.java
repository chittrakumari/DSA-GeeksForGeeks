import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2, 8, 9, 3, 5,6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[i] >arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}