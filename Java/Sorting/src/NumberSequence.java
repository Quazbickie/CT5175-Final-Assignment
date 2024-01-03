public class NumberSequence {

    public static void main(String[] args) {

        int numRows = 25;

        int pascalsTriangle[][] = new int[numRows][numRows];

        pascalsTriangle[0][0] = 1;
        pascalsTriangle[1][0] = 1;
        pascalsTriangle[1][1] = 1;

        for(int i = 2; i < numRows; i++){

            int[] currentRow = pascalsTriangle[i];

            for(int j = 0; j < currentRow.length; j++) {
                if(j == 0 || j == currentRow.length){
                    currentRow[j] = 1;
                }
                else{
                    currentRow[j] = pascalsTriangle[i-1][j-1] + pascalsTriangle[i-1][j];
                }
            }
            pascalsTriangle[i] = currentRow;
        }

        for(int i = 0; i < pascalsTriangle.length; i++){
            for(int j = 0; j < pascalsTriangle[i].length; j++){
                System.out.print(pascalsTriangle[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

}
