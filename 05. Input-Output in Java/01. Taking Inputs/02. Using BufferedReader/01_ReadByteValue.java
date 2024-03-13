import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_ReadByteValue {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        byte a = Byte.parseByte(br.readLine());
        
        System.out.println("The number is: " + a);
    }
}
