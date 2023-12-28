import java.util.Scanner;

public class SumOfFirstNNaturalNumber {
  
    // 1st Approach -> Using Loops => TC = O(n), SC = O(1)
    /*
    public static int naturalSum(int n) {
        int sum = 0;
        
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        
        return sum;
    }
    */
    
    // 2nd Approach -> Using Recursion => TC = O(n), SC = O(n)
    /*
    public static int naturalSum(int n) {
        if(n == 0) {
            return 0;
        }
        
        return (n + naturalSum(n-1));
    }
    */
    
    // 3rd Approachh -> Using Formula => TC = O(1), SC = O(1)
    public static int naturalSum(int n) {
        
        return ((n * (n + 1)) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.println("Sum = " + naturalSum(n));
            
        sc.close();
    }
}
