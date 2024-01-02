import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        // 1st Approach => TC = O(t* min(a, b)), SC = O(1)
        /*
        int gcd = 1;
        int x = Math.min(a, b);
    
        for (int i = 2; i <= x; i++) {
            if (a % i == 0 && b % i == 0) 
                gcd = i;
        }
          
        int lcm = (a * b) / gcd;
        System.out.println("gcd = " + gcd);
        System.out.println("lcm = " + lcm);
        */
    
    
        // 2nd Approach => TC = O(t * sqrt(min(a, b))), SC = O(1)
        /*
        int gcd = 1;
        int x = Math.min(a, b);
    
        for (int i = 1; i * i <= x; i++) {
            if (a % i == 0 && b % i == 0) 
                gcd = i;
    
            if (a % (x/i)==0 && b % (x/i) == 0) {
                gcd = x/i;
                break;
            }
        }
          
        int lcm = (a * b) / gcd;
        System.out.println("gcd = " + gcd);
        System.out.println("lcm = " + lcm);
        */
        
        
        // 3rd Approach => TC = O(t* log(a, b)), SC = O(1)
        int x = a, y = b;
    
        while(x % y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }

        int gcd = y;
        int lcm = (a * b) / gcd;
        System.out.println("gcd = " + gcd);
        System.out.println("lcm = " + lcm);
        
        sc.close();
    }
}
