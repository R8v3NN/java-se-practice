package exercises.intermediate;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		/*
		System.out.println(getDaysInMonth(0,2)); // -1 
		System.out.println(getDaysInMonth(1,2)); // 31
		System.out.println(getDaysInMonth(12,2)); // 31
		System.out.println(getDaysInMonth(13,2)); // -1
		System.out.println(getDaysInMonth(1,10000)); // -1
		System.out.println(getDaysInMonth(1,0)); // -1
		*/
		System.out.println(getDaysInMonth(1,2020)); // 31
		System.out.println(getDaysInMonth(2,2020)); // 29
		System.out.println(getDaysInMonth(2,2018)); // 28
		System.out.println(getDaysInMonth(-1,2020)); // -1
		System.out.println(getDaysInMonth(1,-2020)); // -1
	}
	private static boolean isLeapYear(int year) {
		if(year < 0 || year > 10000) {
			return false;
		}
		else if(((year % 4 == 0) && (year % 100 != 0))  
				|| (((year % 4 == 0) && (year % 100 == 0)
						&& (year % 400 == 0)))) {
			return true;
		}
		else {
			return false;
		}
		
	}
	private static int getDaysInMonth(int month, int year) {
		if((month < 1 || month > 12) 
				|| (year < 1 || year > 9999)) {
			return -1;
		}
		else {
			switch(month) {
				case 1:
					return 31;
				case 2:
					if(isLeapYear(year) == true) {
						return 29;
					}
					return 28;
				case 3:
					return 31;
				case 4:
					return 30;
				case 5:
					return 31;
				case 6:
					return 30;
				case 7:
					return 31;
				case 8:
					return 31;
				case 9:
					return 30;
				case 10:
					return 31;
				case 11:
					return 30;
				case 12:
					return 31;
				default:
					return -1;
			}
		}
	}

	public static class SumOdd {
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
}
