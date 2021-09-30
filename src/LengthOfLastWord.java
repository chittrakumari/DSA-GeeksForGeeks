/*
Given a string S consisting of upper/lower-case alphabets and empty space characters ‘ ‘. The string
may contain spaces at the end.
 You will have return the length of last word which consists of alphabets only.
*/


public class LengthOfLastWord {
    public static void main(String[] args) {
        String r = "   fly me   to   the moon  ";
        String s=new String(r.trim());
        int q=0;
        if(s.length()==1){
            System.out.println(1);
        }
        if(s.length()==0){
            System.out.println(0);;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
                if(s.charAt(i)!=' '){
                    q=q+1;
                }
                else{
                    break;
                }
        }
        System.out.println(q);
    }
}
