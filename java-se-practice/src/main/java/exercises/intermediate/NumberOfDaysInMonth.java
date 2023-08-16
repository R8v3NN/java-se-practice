package ind;

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
			if(isLeapYear(year) == true) {
				switch(month) {
					case 1:
						return 31;
					case 2:
						return 29;
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
			else {
					switch(month) {
					case 1:
						return 31;
					case 2:
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
	}
}
