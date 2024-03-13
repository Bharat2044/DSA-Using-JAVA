import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_ReadLongValue {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        long a = Long.parseLong(br.readLine());
        
        System.out.println("The number is: " + a);
    }
}