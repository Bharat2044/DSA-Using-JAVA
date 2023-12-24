// nCr = (n!) / (r! * (n-r)!)


import java.util.Scanner;

public class BinomialCoefficient {
  
    public static int factorial(int n) {
        if(n <= 1) {
           return 1;
        }
        
        int fact = 1;
        for(int i=2; i<=n; i++) {
            fact *= i;
        } 
        
        return fact;
    }
    
    public static int binCoeffcient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n - r);
        
        return (fact_n / ((fact_r) * (fact_nr)));
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        int ans = binCoeffcient(n, r); 
        
        System.out.println(ans);
    }
}
