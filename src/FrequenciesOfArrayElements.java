import java.util.HashMap;

public class FrequenciesOfArrayElements {
    public void frequency(int[] arr){
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

        System.out.println(h);
    }
    public static void main(String[] args) {
        FrequenciesOfArrayElements obj=new  FrequenciesOfArrayElements();
        int[] arr={10,10,12};
        obj.frequency(arr);

    }
}



