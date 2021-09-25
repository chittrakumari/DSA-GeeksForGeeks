public class NumberOfOccurencesInASortedArray{
        int count(int[] arr, int n, int x) {
            // code here
            int c=0;
            int result;

            for(int i=0;i<n;i++){
                if(arr[i]==x){
                    c=1;
                    result=i+1;
                    while(result<=arr.length-1 && arr[i]==arr[result] ){
                        c=c+1;
                        result=result+1;
                    }
                    return c;
                }
            }
            return c;
        }

    public static void main(String[] args){
        NumberOfOccurencesInASortedArray obj=new NumberOfOccurencesInASortedArray();
        int[] a={6,6};
        int ans=obj.count(a,2,6);
        System.out.println(ans);

    }
}
