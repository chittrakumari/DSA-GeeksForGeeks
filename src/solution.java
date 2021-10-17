import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class solution {
    boolean sameFreq(String s) {
        // code here
        HashMap<Character,Integer> h=new HashMap<>();
        ArrayList<Integer> h1=new ArrayList<>();
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<s.length();i++){

            if(h.containsKey(s.charAt(i)))
            {
                Integer r=h.get(s.charAt(i));
                h.put(s.charAt(i),r+1);


            }
            else{
                h.put(s.charAt(i),1);

            }
        }
        for (int i = 0; i < s.length(); i++) {
            hash.add(h.get(s.charAt(i)));
        }
        h1.addAll(hash);
        System.out.println(h1);

        if(h1.size()>2){
            return false;
        }
        else if(h1.size()==1){
            return true;
        }
        else if (h1.size()==2){
            if(Math.abs(h1.get(0)-h1.get(1))==1){
                return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        solution obj=new solution();
        boolean ans= obj.sameFreq("xxyz");
        System.out.println(ans);
    }
}