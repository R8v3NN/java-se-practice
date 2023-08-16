package ind;

public class EvenDigiSum {
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789)); //20
		System.out.println(getEvenDigitSum(252)); //4
		System.out.println(getEvenDigitSum(-22)); //-1
		
	}
	private static int getEvenDigitSum(int number) {
		if(number < 0) {
			return -1;
		}
		else {
			int sumOfDigits = 0;
			int digit = 0;
			while(number >0) {
				digit = number % 10;
				number = number /10;
				if(digit % 2 == 0) {
					sumOfDigits += digit;
				}
			}
			return sumOfDigits;
		}	
	}
}
