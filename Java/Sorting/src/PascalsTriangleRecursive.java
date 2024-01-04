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


    //Recursive method
    public static void pascal(int[][] array, int i){

        //'Base Case' - condition to stop the recursion.
        //if i == arr.length, we have sorted every 'line'
        //of our double array. Print triangle and return.
        if(i == array.length) {
            printPascal(array);
            return;
        }

        //call sortLine method to calculate current line
        sortLine(array, i);

        //'Recursive Case' - where our function calls itself
        //call pascal method on next 'line' of our double array.
        pascal(array,i+1);

    }

    //Logic of this method is virtually identical to my iterative method,
    //except we only use the inner 'for-loop' as the outer 'for-loop' is
    //handled by the recursive method.
    public static void sortLine(int[][] array, int line){
        int[] currentRow = array[line];
        for(int j = 0; j <= line; j++) {
            if(j == 0){
                currentRow[j] = 1;
            }
            else{
                currentRow[j] = array[line-1][j-1] + array[line-1][j];
            }
        }
        array[line] = currentRow;

    }

    //Method to neatly print Pascal's Triangle
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
