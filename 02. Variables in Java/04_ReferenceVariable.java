public class ReferenceVariable {
    static ReferenceVariable a1 = new ReferenceVariable();  // static reference variable
    static ReferenceVariable a2 = null;    // static reference variable
    static ReferenceVariable a3;          // static reference variable
        
    public static void main(String args[]) {
        System.out.println("Accessing inside main method");
        
        ReferenceVariable a4 = new ReferenceVariable();  // local reference variable
        ReferenceVariable a5 = null;    // local reference variable
        ReferenceVariable a6;           // local reference variable
        
        System.out.println(a1);  
        System.out.println(a2);  
        System.out.println(a3);  
        System.out.println(a4);  
        System.out.println(a5);  
        // System.out.println(a6);  // ReferenceVariable.java:18: error: variable a6 might not have been initialized
        
        ReferenceVariable.test();
    }
    
    public static void test() {
        System.out.println("Accessing inside test method");
        
        System.out.println(a1);  
        System.out.println(a2);  
        System.out.println(a3);  
        
        // System.out.println(a4);  // ReferenceVariable.java:30: error: cannot find symbol
        // System.out.println(a5);  // ReferenceVariable.java:31: error: cannot find symbol
        // System.out.println(a5);  // ReferenceVariable.java:32: error: cannot find symbol
    }

}
