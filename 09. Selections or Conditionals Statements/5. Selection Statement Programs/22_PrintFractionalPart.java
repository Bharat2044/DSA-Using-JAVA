// i/p: 2.3     o/p: 0.3
// i/p: 8.25    o/p: 0.25
// i/p: -1.3    o/p: 0.7


import java.util.Scanner;

public class PrintFractionalPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float n = sc.nextFloat();
    
        int y = (int)n;
        
        if(n < 0)
            y -= 1;
    
        System.out.println(n-y);
    }
}
