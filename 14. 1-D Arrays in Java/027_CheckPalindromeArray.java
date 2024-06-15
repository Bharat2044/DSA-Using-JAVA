// https://www.geeksforgeeks.org/program-to-check-if-an-array-is-palindrome-or-not/

public class CheckPalindromeArray {
  
    // TC = O(n), SC = O(1)
    // Method to check if an array is a palindrome
    public static boolean isPalindrome(int[] arr) {
        int st = 0, end = arr.length - 1;
    
        // Compare elements from start and end moving towards the center
        while (st < end) { 
            if (arr[st] != arr[end]) {
                // If any elements are not equal, array is not a palindrome
                return false;
            }
            st++;
            end--;
        }
        
        // If all elements are equal, array is a palindrome
        return true;
    }
  
    public static void main(String[] args) {
        // Sample array to test the palindrome check
        int[] arr = { 1, 2, 3, 2, 1 };
    
        // Check if the array is a palindrome and print the result
        if (isPalindrome(arr)) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is not Palindrome");
        }
    }
}
