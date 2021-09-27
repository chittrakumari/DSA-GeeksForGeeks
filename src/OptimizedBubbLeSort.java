public class OptimizedBubbLeSort
{
    //Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n)
    {
        //code here
        boolean swapped=false;
        if(arr.length>=2){
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j <n-i-1 ; j++) {
                    if(arr[j]>arr[j+1]){
                        int t=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=t;
                        swapped=true;
                    }

                }
                if(swapped==false){
                    break;
                }
            }

        }
    }}