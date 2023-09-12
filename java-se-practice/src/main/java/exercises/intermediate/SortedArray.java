package exercises.intermediate;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int[] array = getIntegers(5);
        System.out.println("Sorted array:");
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);
    }
    private static int[] getIntegers(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " integer values.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    private static int[] sortIntegers(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
