package exercises.intermediate;

public class ReverseArray {
    public static void reverse(int[] array){
        int temp;
        System.out.print("Array is: \n");
        for(int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        for(int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("\nReversed array is:");
        for(int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 30, 50};
        reverse(array);
    }
}
