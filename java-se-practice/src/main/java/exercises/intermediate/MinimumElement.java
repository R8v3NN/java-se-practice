package exercises.intermediate;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int[] array = readElements(readInteger());
        System.out.println("Minimum value is " + findMin(array));
    }
    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements you want to enter:");
        return scanner.nextInt();
    }

    public static int[] readElements(int input) {
        int[] array = new int[input];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min =  array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
