import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_ReadDoubleValue {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a decimal number: ");
        double a = Double.parseDouble(br.readLine());
        
        System.out.println("The number is: " + a);
    }
}