package ind;

public class NumberPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221)); // true
		System.out.println(isPalindrome(707)); // true
		System.out.println(isPalindrome(11212)); // false
	}
	private static boolean isPalindrome(int number) {
		int reverse = 0;
		int temp = number;
		for(; temp !=0; temp = temp /10) {
			int remainder = temp % 10;
			reverse = reverse*10 + remainder;
		}
		System.out.println(number + " " + reverse);
		if(number == reverse) {
			return true;
		}
		else {
			return false;
		}
	}
}
