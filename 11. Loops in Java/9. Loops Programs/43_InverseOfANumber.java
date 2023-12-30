// Question Link: https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number-official/ojquestion


import java.util.Scanner;

public class InverseOfANumber {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        int x = 1;
        
        while(n != 0) {
            int d = n % 10;
            
            int power = x * (int)Math.pow(10, d-1);
            sum += power;
            
            x++;
            n /= 10;
        }
        
        System.out.println(sum);
        
        sc.close();
    }
}
