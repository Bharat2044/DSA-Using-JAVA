// Armstrong Numbers : A number is called Armstrong number when the sum of the nth power of each digit is equal to the given number.
// For example 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371 407, 1634, 8208 and 9474 are the Armstrong numbers.

// i/p: 153
// o/p: 153 is an Armstrong number      => 1^3 + 5^3 + 3^3 = 153

// i/p: 370
// o/p: 1634 is an Armstrong number     => 3^3 + 7^3 + 0^3 = 370


import java.util.Scanner;

public class CheckArmstrongFor3DigitNumbers {
    
    public static boolean isArmstrong(int n) {
         int sum = 0;
        int temp = n;
        
        // count the number of digits
        int count = (int)(Math.log10(n)+1);

        while(temp != 0) {
            int rem = temp % 10;
    
            sum += (rem*rem*rem);
            temp /= 10;
        }
        
        return (sum == n);
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if(isArmstrong(n))
            System.out.println(n + " is an armstrong number.");
        else
            System.out.println(n + " is not an armstrong number.");
    }
}
