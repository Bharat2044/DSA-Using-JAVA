/*
Problem Description:
You are given a lowercase latin alphabetic character C. You have to tell whether it is a vowel or not.
The characters ‘a’, ‘e’, ‘i’, ‘o’, and ‘u’ are called vowels.

Problem Constraints:
C ∈ [‘a’ - ‘z’]

Input Format:
The input consists of a single character C.

Output Format:
Return 1 if the given character is a vowel, else return 0.

Example Input 1:
a 
Example Onput 1:
1 
Explanation:
since, ‘a’ is a vowel.

Example Input 2:
b
Example Output 2:
0   
Explanation:
since, ‘b’ is a consonant (not a vowel). 
*/


import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        
        if(c >= 'a' && c <= 'z') {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
