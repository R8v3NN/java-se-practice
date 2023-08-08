package lessons.ls3;

public class DigitCounter {
    /*
    *   Count the digits in the rational number
    *   13456 - 5
    *   89 - 2
    *   -45 - 0
     */
    public static void main(String[] args){
        /*
                                                                            Dokonczyc
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to count its digits: ");
        int number;
        */
        System.out.println(numberOfDigits(13456) == 5);
        System.out.println(numberOfDigits(36439382) == 8);
        System.out.println(numberOfDigits(-134) == -1);

    }
    private static int numberOfDigits(int targetNumber){
        /*
        if(targetNumber < 0){
            return -1;
        }
        int counter = 0;
        while(targetNumber > 0){
            targetNumber = targetNumber / 10;

        }
        */
        if(targetNumber < 0){
            return -1;
        }
        else {
            String conversionIntToString = String.valueOf(targetNumber);
            return conversionIntToString.length();
        }
    }
}
