package array;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 7, 19, 2}; // Example array

        // Sort the array in ascending order first
        Arrays.sort(numbers);

        // Reverse the array to get descending order
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Print the sorted array
        System.out.println("Array in descending order: " + Arrays.toString(numbers));
    }
}
