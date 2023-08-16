package exercises.basic;

public class TeenNumberChecker {
    public static void main(String[] args){
        System.out.println(hasTeen(9, 99, 19) == true);
        System.out.println(hasTeen(23, 15, 42) == true);
        System.out.println(hasTeen(22, 23, 34) == false);
        System.out.println("----------------");
        System.out.println(isTeen(9) == false);
        System.out.println(isTeen(13) == true);
        System.out.println("----------------");
        System.out.println(isTeen(19) == true);
        System.out.println(isTeen(21) == false);
    }
    private static boolean hasTeen(int number1, int number2, int number3){
        if(number1 >= 13 && number1 <= 19 || number2 >= 13 &&  number2 <= 19 || number3 >= 13 && number3 <= 19){
            return true;
        }
        else{
            return false;
        }
    }
    private static boolean isTeen(int number){
        if(number >= 13 && number <= 19){
            return true;
        }
        else {
            return false;
        }
    }
}
