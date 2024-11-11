import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
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

        //Print out the matrix
        for(short[] result : matrixOneSize){
            System.out.println(Arrays.toString(result));
        }



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
}