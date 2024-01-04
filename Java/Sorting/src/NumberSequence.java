import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many rows would you like in the triangle?");
        int numRows = myScanner.nextInt();

        //Create pascals triangle as a double array of ints,
        //and initialize the first element of the first row as '1'
        int pascalsTriangle[][] = new int[numRows][numRows];
        pascalsTriangle[0][0] = 1;

        //Iterative method to solve Pascals Triangle
        //Each non-edge element from the third row onwards,
        //is the sum of the two elements directly above it.
        //(ie) element[x][y] = element[x-1][y-1] + element[x-1][y]
        //(ie) element[6][3] is the sum of element[5][2] + element[5][3]
        //The method steps through each row in the double array,
        //performing this calculation for all elements
        for(int i = 1; i < numRows; i++){

            //isolate row we are working on
            int[] currentRow = pascalsTriangle[i];

            //Step 'j' only until equal with 'i'
            //this means that for each line, except the last,
            //we are making the algorithm slightly more efficient.
            //Each row of the double array has the equivalent number of non-zero
            //elements as what row it is on.
            //(ie) [1,0,0,0,0]  -> Row 1
            //     [1,1,0,0,0]  -> Row 2
            //     [1,2,1,0,0]  -> Row 3
            //     [1,3,3,1,0]  -> Row 4
            //     [1,4,6,4,1]  -> Row 5
            //Only the 5th row has 5 elements that need to be calculated
            for(int j = 0; j <= i; j++) {

                //first element of each row will always be '1'
                if(j == 0){
                    currentRow[j] = 1;
                }

                //otherwise perform calculation
                else{
                    currentRow[j] = pascalsTriangle[i-1][j-1] + pascalsTriangle[i-1][j];
                }
            }
            //put isolated row back into the triangle
            pascalsTriangle[i] = currentRow;
        }

        //Method to neatly print Pascal's Triangle
        for(int i = 0; i < pascalsTriangle.length; i++){
            for(int spaceCounter = (pascalsTriangle[i].length - i - 1); spaceCounter > 0; spaceCounter--){
                System.out.print(" ");
            }
            for(int j = 0; j < pascalsTriangle[i].length; j++){
                if(pascalsTriangle[i][j] != 0) {
                    System.out.print(pascalsTriangle[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
    }

}
