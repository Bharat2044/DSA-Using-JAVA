public class LogicalOperator {
    public static void main(String[] args) {
        // && operator
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println();
        
        // || operator
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println();
        
        // ! operator
        System.out.println(!true);
        System.out.println(!false);
        System.out.println();
        
        
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false
    
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false
    
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false
    }
}
