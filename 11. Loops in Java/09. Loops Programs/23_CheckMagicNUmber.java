// ip: 1234             => 1+2+3+4 = 10 => 1+0 = 1
// op: true

// ip: 12345            => 1+2+3+4+5 = 15 => 1+5 = 6
// op: false

// ip:4789              => 4+7+8+9 = 28 => 2+8 = 10 => 1+0 = 1
// op: true


import java.util.Scanner;

public class CheckMagicNUmber {
    public static int sumOfDigits(int num) {
        int sum = 0;
        
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
      
        /*
        // Approach - 1 : Time Complexity - O(logn), Space Complexity - O(1)
        while(n > 9) {
            n = sumOfDigits(n);
        }
        
        if(n == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic Number");
        */
        
        
        /*
        // Approach - 2 : Time Complexity - O(logn), Space Complexity - O(1)
        int sum = 0;

        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            
            sum += n % 10;
            n /= 10;
        }
        
        if(sum == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic Number");
        */
        
        
        
        // Approach - 3 : Time Complexity - O(1), Space Complexity - O(1)
        if(n % 9 == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic Number");
    }
}