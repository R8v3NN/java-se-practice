package ind;

public class NumberInWord {
	public static void main(String[] args) {
		printNumberlnWord(0);
		printNumberlnWord(1);
		printNumberlnWord(2);
		printNumberlnWord(3);
		printNumberlnWord(4);
		printNumberlnWord(5);
		printNumberlnWord(6);
		printNumberlnWord(7);
		printNumberlnWord(8);
		printNumberlnWord(9);
		printNumberlnWord(10);
		printNumberlnWord(-11);
		
	}
	private static void printNumberlnWord(int number) {
		switch(number) {
			case 0:
				System.out.println("ZERO");
				break;
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			case 4:
				System.out.println("FOUR");
				break;
			case 5:
				System.out.println("FIVE");
				break;
			case 6:
				System.out.println("SIX");
				break;
			case 7: 
				System.out.println("SEVEN");
				break;
			case 8:
				System.out.println("EIGHT");
				break;
			case 9:
				System.out.println("NINE");
				break;
			default:
				System.out.println("OTHER");
		}
	}
}
