package exercises.basic;

public class DecimalComparator {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175) == true);
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176) == false);
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0) == true);
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123) == false);
    }
    private static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        if((int)(number1*1000) == (int)(number2*1000)){
            return true;
        }
        else {
            return false;
        }
    }
}
