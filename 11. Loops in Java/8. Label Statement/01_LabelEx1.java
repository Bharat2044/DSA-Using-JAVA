public class LabelEx1 {
    public static void main(String[] args) {
        label1: 
        
        for (int i=1; i<=5; i++) { 
            if (i == 3) 
                break label1; 
                
            System.out.print(i + " "); 
        } 
    }
}