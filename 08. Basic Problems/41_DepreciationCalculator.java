// Calculate Depreciation of Value

import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the initial value
        System.out.print("Enter the initial value of the asset: ");
        double initialValue = sc.nextDouble();

        // Input for the salvage value
        System.out.print("Enter the salvage value of the asset: ");
        double salvageValue = sc.nextDouble();

        // Input for the useful life
        System.out.print("Enter the useful life of the asset (in years): ");
        int usefulLife = sc.nextInt();

        // Calculate depreciation using the straight-line method
        double depreciation = (initialValue - salvageValue) / usefulLife;

        // Display the result
        System.out.println("Straight-line Depreciation per Year: " + depreciation);
        
        sc.close();
    }
}
