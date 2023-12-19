public class BreakStatementEx3 {
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++) {
            System.out.println("For i = " + i + " ===>");
            
            for(int j=1; j<=5; j++) {
                if(j%2 == 0)
                    break;
                    
                System.out.print(j + " ");
            }

            System.out.println();
            
            for(int k=11; k<=15; k++) 
                System.out.print(k + " ");
        
            System.out.println();
            System.out.println();
        } 
    }
}