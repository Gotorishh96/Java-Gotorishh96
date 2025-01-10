// Java Program to Check if a 
// String is a Palindrome
import java.io.*;

public class PalindromeString {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
      
        // Convert string to lowercase for 
        // case-insensitive comparison
        s = s.toLowerCase();

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // Compare the original string with 
        // the reversed string
        return s.equals(rev);
    }

    public static void main(String[] args) {
      
        // Input string
        String s = "level";

        // Check if the string is a palindrome
        boolean res = isPalindrome(s);

        // Print the result
        if (res) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }
    }
}
