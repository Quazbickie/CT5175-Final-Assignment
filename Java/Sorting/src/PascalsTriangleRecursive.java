import java.util.Scanner;

public class PascalsTriangleRecursive {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many rows would you like in the triangle?");
        int numRows = myScanner.nextInt();
        int pascalsTriangle[][] = new int[numRows][numRows];
        pascalsTriangle[0][0] = 1;
        pascal(pascalsTriangle, 1);
    }

    public static void pascal(int[][] array, int i){



        if(i == array.length) {
            printPascal(array);
            return;
        }

        sortLine(array, i);
        pascal(array,i+1);

    }

    public static void sortLine(int[][] array, int line){
        int[] currentRow = array[line];

        for(int j = 0; j < currentRow.length; j++) {
            if(j == 0){
                currentRow[j] = 1;
            }
            else{
                currentRow[j] = array[line-1][j-1] + array[line-1][j];
            }
        }
        array[line] = currentRow;

    }

    public static void printPascal(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int spaceCounter = (array[i].length - i - 1); spaceCounter > 0; spaceCounter--){
                System.out.print(" ");
            }
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
    }

}
