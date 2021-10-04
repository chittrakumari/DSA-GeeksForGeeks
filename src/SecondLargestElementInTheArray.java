public class SecondLargestElementInTheArray {
    public static int secondlargest(int[] arr) {

        int largest = 0;
        int secondlargest = -1;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[largest]) {
                secondlargest = largest;
                largest = i;

            } else if (arr[i] != arr[largest]) {
                if (secondlargest == -1 || arr[i] > arr[secondlargest]) {
                    secondlargest = i;
                }
            }
        }

        if (secondlargest != -1) {
            return arr[secondlargest];

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ans={10,10,10,10,10};
       int n=secondlargest(ans);
        System.out.println(n);
    }
}
