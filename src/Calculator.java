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

        byte function = 0;
        while ((function = byteSizeInt()) < 1 || function > 9) {
            System.out.print("Error please enter a number between 1-9: ");
        }
        System.out.println(function);
    }
    public static short[][] MatrixSize;{
        //input no of rows
        System.out.print("Enter Number of Rows: ");
        short noOfRowsMatrixOne;
        while ((noOfRowsMatrixOne = shortSizeInt()) == 0){
            System.out.print("Error please enter a number between 1-32767: ");
        }

        //input no of rows
        System.out.print("Enter Number of Columns: ");
        short noOfColomsMatrixOne;
        while ((noOfColomsMatrixOne = shortSizeInt()) == 0){
            System.out.print("Error please enter a number between 1-32767: ");
        }

        //Create a 2D array or Matrix
        short[][]matrixOneSize = new short[noOfRowsMatrixOne][noOfColomsMatrixOne];
        matrixOneSize[0][1] = 25;




        return matrixOneSize;
    }

    public static short shortSizeInt() {
        Scanner input = new Scanner(System.in);
        try {
            return input.nextShort();
        }catch(NumberFormatException e){
            return 0;
        } catch (InputMismatchException e) {
            // This block catches InputMismatchException
            return 0;
        }
    }
    public static byte byteSizeInt() {
        Scanner input = new Scanner(System.in);
        try {
            return input.nextByte();
        }catch(NumberFormatException e){
            return 0;
        } catch (InputMismatchException e) {
            // This block catches InputMismatchException
            return 0;
        }
    }
}