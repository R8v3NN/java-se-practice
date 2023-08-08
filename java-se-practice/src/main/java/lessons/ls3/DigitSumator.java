package lessons.ls3;

import java.util.Scanner;
public class DigitSumator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pass an number: ");
        int num = scanner.nextInt();
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int number){
        int temp = 0;
        int sumOfDigits = 0;
        if(number < 0){
            temp = -number;
        }
        else if (number == 0) {
            return 0;
        }
        else {
            temp = number;
        }
        while(temp > 9){
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        return sumOfDigits += temp;
    }
}
