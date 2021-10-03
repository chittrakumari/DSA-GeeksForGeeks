public class PowerOfANumberUsingRecursion {
    public int power(int number,int exponent){

        if(exponent==0){
            return 1;
        }
        return number*power(number,exponent-1);
    }

    public static void main(String[] args) {
        PowerOfANumberUsingRecursion obj=new PowerOfANumberUsingRecursion();
        System.out.println(obj.power(3,4));
    }
}
