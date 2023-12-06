public class InstanceVariable {
    static int x = 10;     // instance variable
    static double y;       // instance variable
        
    public static void main(String args[]) {
        System.out.println("Accessing inside main method");
        
        InstanceVariable refVar1 = new InstanceVariable();
        System.out.println(refVar1.x);  
        System.out.println(refVar1.y);   
        
        refVar1.test();
    }
    
    public void test() {
        System.out.println("Accessing inside test method");
        
        InstanceVariable refVar2 = new InstanceVariable();
        System.out.println(refVar2.x);   
        System.out.println(refVar2.y);   
    }

}
