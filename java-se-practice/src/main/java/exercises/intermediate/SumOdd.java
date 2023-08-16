package ind;

public class SumOdd {
	public static void main(String[] args) {
		System.out.println(sumOdd(1, 100)); // 2500
		System.out.println(sumOdd(-1, 100)); // -1
		System.out.println(sumOdd(100, 100)); // 0
		System.out.println(sumOdd(13, 13)); // 13
		System.out.println(sumOdd(100, -100)); // -1
		System.out.println(sumOdd(100, 1000)); // 247500
	}
	private static boolean isOdd(int number) {
		if(number < 0){
			return false;
		}
		else if(number % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	private static int sumOdd(int start, int end) {
		int sum = 0;
		if((start < 0 || end < 0) || (end < start)) {
			return -1;
		}
		else {
			for(int i = start; i <= end; i++) {
				if(isOdd(i) == true) {
					sum+= i;		
				}
			}
		}
		return sum;
	}
}
