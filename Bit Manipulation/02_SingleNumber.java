/*
 Single Number

Problem Description:
Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Problem Constraints:
1 <= |A| <= 2000000
0 <= A[i] <= INTMAX
 
Input Format:
The first and only argument of input contains an integer array A.
 
Output Format:
Return a single integer denoting the single element.

Example Input:
Input 1:
 A = [1, 2, 2, 3, 1]
Input 2:
 A = [1, 2, 2]

Example Output:
Output 1:
 3
Output 2:
 1

Example Explanation:
Explanation 1:
3 occurs once.
Explanation 2:
1 occurs once.
*/



public class Solution {
 
    // Time Complexity = O(n), Space Complexity = O(1) 
    public int singleNumber(final int[] A) {
     
        int ans = A[0];

        for (int i = 1; i < A.length; i++) {
            ans ^= A[i];
        }

        return ans;
    }
}
