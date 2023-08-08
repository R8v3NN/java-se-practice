package lessons.ls5;

import lessons.ls4.User;
import java.util.Arrays;

public class ArraySandbox {
    public static void main(String[] args){
        /*
            A array creation
         */
        String name1 = "Joe";
        String name2 = "Jane";
        String name3 = "Ivan";
        //String[] names = new String[5];
        String[] names = new String[]{"Joe", "Jane", "Ivan"};
        User[] users = new User[]{new User("Joe"),new User("Jane"), new User("Ivan")};
        int[] evenNumbers = {2, 4, 6, 8, 9};
        /*
            Access to array elemtnt
         */
        User joe = users[2];
        joe.name = "John";
        String joeName = names[0];
        joeName = "John";
       // System.out.println(users[0]);
        //System.out.println(names[0]);
        /*
            Loop array
         */
        //System.out.println(users[0]);
        //System.out.println(users[1]);
        //System.out.println(users[2]);
        System.out.println("---------------------------");
        for(User user : users){
            System.out.println(user);
        }
        /*
        int 1 = 0;
        while(1< user.length){
            System.out.println(users[1]);
            i++;
        }
         */
        /*
            Output array - Arrays.toString(..)
         */
        System.out.println(Arrays.toString(users));
        /*
            How to sort an array
         */
        int[] unsortedNumbers = {6, 4, 6, 8, 9, 3, 12, 10};
        Arrays.sort(unsortedNumbers);
        System.out.println(Arrays.toString(unsortedNumbers));
        /*
            Search in array - Arrays.binarySearch(..)
         */
        // [3, 4, 6, 6, 8, 9, 10, 12]
        System.out.println(Arrays.binarySearch(unsortedNumbers, 8) == 4);
        /*
            Copy an array/part of array
         */
        int[] peaceOfOurSortedArray = Arrays.copyOfRange(unsortedNumbers, 1, 4);
        String[] sortedCopyOfArray = Arrays.copyOf(names, 16);
        //System.out.println(Arrays.toString(peaceOfOurSortedArray));
        //System.out.println(Arrays.toString(sortedCopyOfArray));
        /*
            Fill an array with values - Arrays.fill()
         */
        int[] arrayOf_100 = new int[20];
        Arrays.fill(arrayOf_100, 100);
        //System.out.println(Arrays.toString(arrayOf_100));
        int[] numbers1 = {1, 2, 3, 8, 1};
        int[] numbers2 = {1, 2, 3, 5, 5};
    }
}
