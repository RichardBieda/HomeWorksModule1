package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution6 {

    public static int getIndex(int[] arr, int value) { //Method for searching the index
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int[] getDeepIndex(int[][] arr, int value) { // Method for searching the index in a multi dimensional array.
        int[] index = {-1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int x = getIndex(arr[i], value); // the getIndex method is calling
                if (x != -1) {
                    index[0] = i;
                    index[1] = x;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {

        // Write a program to find the index of an array element. (-1 if not found)
          int[] array = {5, 88, -7, 9, 0, 12};
          int[][] multidimensionalArray = {{3, 6, 9}, {4, 8, 12}};

          Scanner scanner = new Scanner(System.in);
          int number = scanner.nextInt();
          System.out.println(getIndex(array, number));
          int number2 = scanner.nextInt();
          System.out.println(Arrays.toString(getDeepIndex(multidimensionalArray, number2))); // Arrays.toString is a static method of the Arrays class to print array indeces.

        //------------------------------------------------------------------------------------------------
        // Write a program to find the number of even and odd integers in a given array of integers.


    }
}
