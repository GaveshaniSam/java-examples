package array;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 7, 19, 2}; // Example array

        // Assume the first element is the maximum
        int max = numbers[0];

        // Loop through the array and compare each element
        for (int num : numbers) {
            if (num > max) {
                max = num; // Update max if a larger number is found
            }
        }

        // Output the maximum number
        System.out.println("The maximum number is: " + max);
    }
}
