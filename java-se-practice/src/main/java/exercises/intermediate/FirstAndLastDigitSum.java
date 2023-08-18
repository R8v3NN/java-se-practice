package exercises.intermediate;

public class FirstAndLastDigitSum {
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252)); //4
		System.out.println(sumFirstAndLastDigit(257)); //9
		System.out.println(sumFirstAndLastDigit(0)); //0
		System.out.println(sumFirstAndLastDigit(5)); //10
		System.out.println(sumFirstAndLastDigit(-10)); //-1
	}
	private static int sumFirstAndLastDigit(int number) {
		if(number < 0) {
			return -1;
		}
		else {
			int firstDigit = 0;
			int lastDigit = 0;
			lastDigit = number % 10;
			while(number != 0) {
				firstDigit = number % 10;
				number = number / 10;
			}
			return lastDigit+firstDigit;
		}
	}
}
