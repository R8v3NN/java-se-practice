package exercises.intermediate;

public class PerfectNumber {
    public static void main(String[] args){
        System.out.println(isPerfectNumber(6)); //true
        System.out.println(isPerfectNumber(28)); //true
        System.out.println(isPerfectNumber(5)); //false
        System.out.println(isPerfectNumber(-1)); //false
    }
    private static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        else{
            int SumOfDivisor = 0;
            for(int i = 1; i < number; i++){
                if(number%i == 0){
                    SumOfDivisor += i;
                }
            }
            if(SumOfDivisor == number){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
