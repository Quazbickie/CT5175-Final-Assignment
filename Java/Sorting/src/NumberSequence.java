import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many rows would you like in the triangle?");
        int numRows = myScanner.nextInt();
        int pascalsTriangle[][] = new int[numRows][numRows];
        pascalsTriangle[0][0] = 1;

        for(int i = 1; i < numRows; i++){
            int[] currentRow = pascalsTriangle[i];
            for(int j = 0; j < currentRow.length; j++) {
                if(j == 0){
                    currentRow[j] = 1;
                }
                else{
                    currentRow[j] = pascalsTriangle[i-1][j-1] + pascalsTriangle[i-1][j];
                }
            }
            pascalsTriangle[i] = currentRow;
        }

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
