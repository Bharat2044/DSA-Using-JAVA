import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _08_ReadCharacterValue {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a character: ");
        char a = br.readLine().charAt(0);
        
        System.out.println("The Character: " + a);        
    }
}