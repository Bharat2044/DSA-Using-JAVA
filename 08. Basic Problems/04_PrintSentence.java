/*
Problem Description:
Given an english sentence, take it in the input and print it in the output.
 
Input Format:
Single line containing an english sentence.
 
Output Format:
Print in a single line the sentence in the input.
 
Example Input:
Input 1:
Harry loves Hagrid !
Input 2:
I am a Boy
 
Example Output:
Output 1:
Harry loves Hagrid !
Output 2:
I am a Boy
*/


import java.util.Scanner;
public class PrintSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(str);
    }
}
