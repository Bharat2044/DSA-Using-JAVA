public class SumOf2Number {
  
    public static int returnSum(int a, int b) {
        int c = a + b;
        
        System.out.println("Result before return statement: " + c);
        
        // Return statement.
        return c;
    }
  
    public static void main(String[] args) {
        // Initializing variables.
        int a = 5, b = 6;
        
        // Calling function.
        int result = returnSum(a, b);
    
        System.out.println("Result after return statement: " + result);
    }
}