// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


import java.util.Scanner;

public class MaximumAndMinimumAmongThreeNumbers {
  
    public static int maximum(int a, int b, int c) {
        int ans = (a > b && a > c) ? a : (b > c ? b : c);
        
        return ans;
    }
  
    public static int minimum(int a, int b, int c) {
        int ans = (a < b && a < c) ? a : (b < c ? b : c);
        
        return ans;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("Largest number = " + maximum(a, b, c));
        System.out.println("Smallest number = " + minimum(a, b, c));
        
        sc.close();
    }
}
