package exercises.intermediate;

public class LastDigitChecker {
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(41, 22, 71)); //true
        System.out.println(hasSameLastDigit(23, 32, 42)); //true
        System.out.println(hasSameLastDigit(9, 99, 999)); //false
        System.out.println("------------------");
        System.out.println(isValid(468)); //true
        System.out.println(isValid(1051)); //false
    }
    private static boolean hasSameLastDigit(int number1, int number2, int number3){
        if(number1 >= 10 && number1 <= 1000 && number2 >= 10
                && number2 <= 1000 && number3 >= 10 && number3 <= 1000) {
            int lastNumber1 = number1 % 10;
            int lastNumber2 = number2 % 10;
            int lastNumber3 = number3 % 10;
            return (lastNumber1 == lastNumber2 || lastNumber1 == lastNumber3 || lastNumber2 == lastNumber3);
        }
        else {
            return false;
        }
    }
    private static boolean isValid(int number){
        if(number >= 10 && number <= 1000){
            return true;
        }
        else {
            return false;
        }
    }
}