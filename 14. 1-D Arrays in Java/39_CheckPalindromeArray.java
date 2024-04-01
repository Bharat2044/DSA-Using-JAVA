// https://www.geeksforgeeks.org/program-to-check-if-an-array-is-palindrome-or-not/

public class CheckPalindromeArray {
  
    // TC = O(n), SC = O(1)
    public static boolean isPalindrome(int[] arr) {
        int st = 0, end = arr.length - 1;
    
    		while (st < end) {
      			if (arr[st] != arr[end]) {
        				return false;
      			}
      
      			st++;
      			end--;
    		}
    		
    		return true;
    }
  
	  public static void main(String[] args) {
    		int[] arr = { 1, 2, 3, 2, 1 };
    
    		if (isPalindrome(arr)) {
    	  		System.out.println("Array is Palindrome");
    		} else {
      			System.out.println("Array is not Palindrome");
    		}
    }
}
