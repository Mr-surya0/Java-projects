package com.Test3;

import java.util.Scanner;
import java.util.Arrays;

public class T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        System.out.print("Enter the position to insert the number: ");
        int position = scanner.nextInt();

        System.out.print("Enter the number to insert: ");
        int numberToInsert = scanner.nextInt();

        if (position < 0 || position > array.length) {
            System.out.println("Invalid position. Please enter a valid position.");
        } else {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, position);

            newArray[position] = numberToInsert;

            System.arraycopy(array, position, newArray, position + 1, array.length - position);

            array = newArray;

            System.out.println("Array after insertion: " + Arrays.toString(array));
        }

        scanner.close();
    }
}
