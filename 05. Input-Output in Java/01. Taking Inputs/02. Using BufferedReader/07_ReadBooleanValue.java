import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _07_ReadBooleanValue {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a boolean value: ");
        boolean a = Boolean.parseBoolean(br.readLine()); 
        
        System.out.println("Result: " + a);
    }
}