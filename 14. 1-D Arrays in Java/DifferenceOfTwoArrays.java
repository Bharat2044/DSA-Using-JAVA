// Question Link: https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/difference-of-two-arrays-official/ojquestion


/*
i/p: 
n1 = 4
arr1 = 1 0 0 0
n2 = 3
arr2 = 2 6 7
o/p: 7 3 3
*/


import java.util.Scanner;

public class DifferenceOfTwoArrays {
  
    public static int[] difference(int[] one, int[] two) {
        int[] ans = new int[one.length];
        
        int i = one.length - 1;
        int j = two.length - 1;
        int k = ans.length - 1;
        
        int b = 0;  // borrow
        while(k >= 0) {
            int d = one[i] - b;
            
            if(j >= 0) {
                d = d - two[j];
            }
            
            if(d < 0) {
                d = d + 10;
                b = 1;
            } else {
                b = 0;
            }
            
            ans[k] = d;
            
            i--;
            j--;
            k--;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int[] one = new int[n1];
        
        // taking array1 inputs
        for(int i = 0; i < one.length; i++) {
            one[i] = sc.nextInt();
        }
        
        int n2 = sc.nextInt();
        int[] two = new int[n2];
        
        // taking array2 inputs
        for(int i = 0; i < two.length; i++) {
            two[i] = sc.nextInt();
        }
        
        int[] result = difference(one, two);
        
        // Don't print leading zeroes
        int idx = 0;
        while(idx < result.length) {
            if(result[idx] != 0)
                break;
            else
                idx++;
        }
        
        for(int i = idx; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close();
    }
}

