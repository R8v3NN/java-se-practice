package exercises.basic;

public class EqualSumChecker {
    public static void main(String[] args){
        System.out.println(hasEqualSum(1, 1, 1) == false);
        System.out.println(hasEqualSum(1, 1, 2) == true);
        System.out.println(hasEqualSum(1, -1, 0) == true);
    }
    private static boolean hasEqualSum(int number1, int number2, int number3){
        if((number1+number2) == number3){
            return true;
        }
        else{
            return false;
        }
    }
}
