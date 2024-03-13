import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_ReadFloatValue {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a decimal number: ");
        float a = Float.parseFloat(br.readLine());
        
        System.out.println("The number is: " + a);
    }
}