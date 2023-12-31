// i/p: n = 121321, d = 1
// o/p: 3
// i/p: n = 121321, d = 2
// o/p: 2


import java.util.Scanner;

public class FrequencyOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter a digit want to check frequency: ");
        int d = sc.nextInt();
      
        int count = 0;
   
        while(n != 0) {
            if(n%10 == d)
                count++;
                
            n /= 10;
        }
        
        System.out.println("Answer = " + count);
    }
}