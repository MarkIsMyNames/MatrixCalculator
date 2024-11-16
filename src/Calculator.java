import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // select function
        System.out.println(
                """
                        Enter (1) for Addition
                        Enter (2) for Subtraction
                        Enter (3) for Multiplication
                        Enter (4) for Transpose
                        Enter (5) for Inverse
                        Enter (6) for Simultaneous Equations
                        Enter (7) for def(A)
                        Enter (8) for Eigenvalues
                        Enter (9) for Power""");

        // checking is a valid function selected
        byte function = 0;
        while ((function = byteSizeInt()) < 1 || function > 9) {
            System.out.print("Error please enter a number between 1-9: ");
        }
        // Checks which function is selected
        if(function == 1){
            double[][]matrix1 = matrixCreator();
        }
    }

    // Ensures an int of size short is inputted
    public static short shortSizeInt() {
        Scanner input = new Scanner(System.in);
        try {
            return input.nextByte();
        } catch (InputMismatchException e) {
            // This block catches InputMismatchException
            // if patterns don't match e.g. a letter or a number too big
            return 0;
        }
    }

    // Ensures an int of size byte is inputted
    public static byte byteSizeInt() {
        Scanner input = new Scanner(System.in);
        try {
            return input.nextByte();
        } catch (InputMismatchException e) {
            // This block catches InputMismatchException
            // if patterns don't match e.g. a letter or a number too big
            return 0;
        }
    }

    // used to create a matrix
    public static double[][] matrixCreator() {
        //input no of rows
        System.out.print("Enter Number of Rows: ");
        short noOfRowsMatrixOne;
        // checks if the number of rows is valid
        while ((noOfRowsMatrixOne = shortSizeInt()) == 0){
            System.out.print("Error please enter a number between 1-32767: ");
        }

        //input no of columns
        System.out.print("Enter Number of Columns: ");
        short noOfColomsMatrixOne;
        // checks if the number of coloms is valid
        while ((noOfColomsMatrixOne = shortSizeInt()) == 0){
            System.out.print("Error please enter a number between 1-32767: ");
        }

        //Create a 2D array or Matrix
        double[][]matrixOneSize = new double[noOfRowsMatrixOne][noOfColomsMatrixOne];

        // using scanner to find the numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first row:\t");

        // itterate through the rows
        for(int rowCounter = 0; rowCounter<noOfRowsMatrixOne; rowCounter++){

            String rowListWithSpace = input.nextLine();
            // itterate through the coloums and adding them to the matrix
            for(int positionCounter = 0; positionCounter<noOfColomsMatrixOne; positionCounter++){
                matrixOneSize[rowCounter][positionCounter] = 1;
            }
            System.out.print("Enter next row:\t\t");
        }

          // Print the output
            for (double[] row : matrixOneSize) {
                    System.out.println(Arrays.toString(row));
            }

        return matrixOneSize;
    }
}