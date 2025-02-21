package com.Test3;
import java.util.Arrays;
import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        System.out.print("Enter the index to delete the element: ");
        int indexToDelete = scanner.nextInt();

        if (indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("Invalid index. Please enter a valid index.");
        } else {
            int[] newArray = new int[array.length - 1];

            System.arraycopy(array, 0, newArray, 0, indexToDelete);

            System.arraycopy(array, indexToDelete + 1, newArray, indexToDelete, array.length - indexToDelete - 1);

            array = newArray;

            System.out.println("Array after deletion: " + Arrays.toString(array));
        }

        scanner.close();
    }
}
