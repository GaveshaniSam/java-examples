package loop;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
//        Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

//        Ask the user to enter a string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

//        Assume the string is a palindrome
        boolean isPalindrome = true;

//        Get the length of the string
        int length = str.length();

//        Loop through the first half of the string to check if it's the same as the second half
        for (int i = 0; i < length / 2; i++) {
//            If characters don't match, it's not a palindrome
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false; // Set the flag to false
                break; // Exit the loop as we found a mismatch
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        scanner.close();
    }
}
