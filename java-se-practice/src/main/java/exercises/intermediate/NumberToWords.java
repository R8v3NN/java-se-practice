package exercises.intermediate;

public class NumberToWords {
    public static void main(String[] args){
        System.out.println(getDigitCount(0)); //1
        System.out.println(getDigitCount(123)); //3
        System.out.println(getDigitCount(-12)); //-1
        System.out.println(getDigitCount(5200)); //4
        System.out.println("---------------");
        System.out.println(reverse(-121)); //-121
        System.out.println(reverse(1212)); //2121
        System.out.println(reverse(1234)); //4321
        System.out.println(reverse(100)); //1
        System.out.println("---------------");
        numberToWords(123); //ONE TWO THREE
        numberToWords(1010); //ONE ZERO ONE ZERO
        numberToWords(1000); //ONE ZERO ZERO ZERO
        numberToWords(-12); //Invalid Number
    }
    private static void printNumberlnWord(int number) {
        switch(number) {
            case 0:
                System.out.print("ZERO ");
                break;
            case 1:
                System.out.print("ONE ");
                break;
            case 2:
                System.out.print("TWO ");
                break;
            case 3:
                System.out.print("THREE ");
                break;
            case 4:
                System.out.print("FOUR ");
                break;
            case 5:
                System.out.print("FIVE ");
                break;
            case 6:
                System.out.print("SIX ");
                break;
            case 7:
                System.out.print("SEVEN ");
                break;
            case 8:
                System.out.print("EIGHT ");
                break;
            case 9:
                System.out.print("NINE ");
                break;
            default:
                System.out.print("OTHER ");
        }
    }
    private static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }
        return reverseNumber;
    }
    private static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        else {
            return (Integer.toString(number)).length();
        }
    }
    private static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Number");
        }
        else {
            int reverseNumber = reverse(number);
            int lengthOfNumber = Integer.toString(number).length();
            int lengthOfReverseNumber = Integer.toString(reverse(number)).length();
            while (reverseNumber != 0) {
                int LastNumberDigit = reverseNumber % 10;
                printNumberlnWord(LastNumberDigit);
                reverseNumber = reverseNumber / 10;
            }
            if(lengthOfNumber != lengthOfReverseNumber){
                for(int i = 0;i < (lengthOfNumber-lengthOfReverseNumber);i++){
                    System.out.print("ZERO ");
                }
            }
            System.out.println("");
        }
    }
}
