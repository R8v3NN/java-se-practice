package exercises.intermediate;

public class SharedDigit {
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23)); //true
		System.out.println(hasSharedDigit(9, 99)); //false
		System.out.println(hasSharedDigit(15, 55)); //true
	}
	private static boolean hasSharedDigit(int number1, int number2) {
		if((number1 >= 10 && number1 <= 99)
				&& (number2 >= 10 && number2 <= 99)){
			int secondNumber1 = number1 % 10;
			int firstNumber1 = number1 /= 10;
			int secondNumber2 = number2 %10;
			int firstNumber2 = number2 /= 10;

			return ((firstNumber1 == firstNumber2) || (firstNumber1 == secondNumber2)
					|| (secondNumber1 == firstNumber2) || (secondNumber1 == secondNumber2));
		}
		else {
			return false;
		}
	}
}
