import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12_SumOfThreeNumbers {
	public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter 1st number: ");
        int a = Integer.parseInt(br.readLine());
        
        System.out.print("Enter 2nd number: ");
        int b = Integer.parseInt(br.readLine());
        
        System.out.print("Enter 3rd number: ");
        int c = Integer.parseInt(br.readLine());
        
        int sum = a + b + c;
        
        System.out.println("Sum = " + sum);
    }
}
