public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
        // 1. Pre Increment Operator (++x)
        int a = 5;
        System.out.println("a = " + " " + ++a);
        
        // 2. Post Increment Operator (x++)
        int b = 5;
        System.out.println("b = " + " " + b++);
        
        // 3. Pre Decrement Operator (--x)
        int c = 5;
        System.out.println("c = " + " " + --c);
        
        // 4. Post Decrement Operator (x--)
        int d = 5;
        System.out.println("d = " + " " + d--);
        
        
        int e = 5;
        int f = e--;
        System.out.println("e = " + e + "   f =  " + f);
        
        int g = 5;
        int h = --g;
        System.out.println("g = " + g + "   h =  " + h);
        
        int i = 5;
        int j = i++;
        System.out.println("i = " + i + "   j =  " + j);
        
        int k = 5;
        int l = ++k;
        System.out.println("k = " + k + "   l =  " + l);
    }
}
