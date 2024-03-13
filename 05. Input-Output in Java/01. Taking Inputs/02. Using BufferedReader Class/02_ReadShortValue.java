import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_ReadShortValue {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        short a = Short.parseShort(br.readLine());
        
        System.out.println("The number is: " + a);
    }
}

