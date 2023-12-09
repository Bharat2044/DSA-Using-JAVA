/*
n = 5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/



import java.util.Scanner;

public class Pattern56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j)%2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
                
            System.out.println();
        }
    }
}
