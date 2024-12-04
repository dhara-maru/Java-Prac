import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare two 3x3 matrices
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];

        // Input elements for the first matrix (matrixA)
        System.out.println("Enter elements for the first 3x3 matrix (Matrix A):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input elements for the second matrix (matrixB)
        System.out.println("Enter elements for the second 3x3 matrix (Matrix B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Check if matrices are equal
        boolean areEqual = false; // Assume matrices are equal initially

        // Compare corresponding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrixA[i][j] == matrixB[i][j]) {
                    areEqual = true; // If any element is different, set areEqual to false
                    break;
                }
            }
            if (!areEqual)
                break; // Exit the loop early if matrices are not equal
        }

        // Output the result
        if (areEqual) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
        }
    }
}
