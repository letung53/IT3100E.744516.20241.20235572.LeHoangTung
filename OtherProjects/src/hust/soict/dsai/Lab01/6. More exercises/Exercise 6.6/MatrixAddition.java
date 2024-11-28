import javax.swing.JOptionPane;
import java.util.Scanner;

public class MatrixAddition {


    public static void displayMatrix(int[][] matrix, String title) {
        StringBuilder matrixString = new StringBuilder();
        for (int[] row : matrix) {
            for (int num : row) {
                matrixString.append(num).append(" ");
            }
            matrixString.append("\n");
        }
        JOptionPane.showMessageDialog(null, matrixString.toString(), title, JOptionPane.INFORMATION_MESSAGE);
    }


    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }


    public static int[][] getUserMatrixInput(int rows, int cols, Scanner scanner, String matrixName) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter values for " + matrixName + " (each row separated by space):");
        for (int i = 0; i < rows; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;


        while (choice != 0 && choice != 1) {
            String input = JOptionPane.showInputDialog("Choose an option:\n0 - Predefined Matrices\n1 - User Input");
            if (input == null) {
                System.exit(0); 
            }
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                choice = -1; 
            }


            if (choice != 0 && choice != 1) {
                JOptionPane.showMessageDialog(null, "Invalid choice. Please enter 0 or 1.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (choice == 0) {

            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            int[][] matrix2 = {
                    {9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}
            };

            displayMatrix(matrix1, "Matrix 1");
            displayMatrix(matrix2, "Matrix 2");

            int[][] result = addMatrices(matrix1, matrix2);
            displayMatrix(result, "Resultant Matrix");

        } else if (choice == 1) {

            JOptionPane.showMessageDialog(null, "You will input the matrices in the terminal.", "Terminal Input", JOptionPane.INFORMATION_MESSAGE);

            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();


            int[][] matrix1 = getUserMatrixInput(rows, cols, scanner, "Matrix 1");

 
            int[][] matrix2 = getUserMatrixInput(rows, cols, scanner, "Matrix 2");


            displayMatrix(matrix1, "Matrix 1");
            displayMatrix(matrix2, "Matrix 2");


            int[][] result = addMatrices(matrix1, matrix2);
            displayMatrix(result, "Resultant Matrix");
        }
    }
}
