public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort();
        QuickSort();
    }


    public static void SelectionSort(){
        int[] myArray = new int[]{12,3,2,4,5,1,123,66,43,54,78,89,96,43,22,11};

        for(int i = 0; i < myArray.length; i++){
            int lowestIdx = i;
            for(int j = i+1; j < myArray.length; j++){
                if(myArray[j] < myArray[lowestIdx]){
                    lowestIdx = j;
                }
            }
            int temp = myArray[lowestIdx];
            myArray[lowestIdx] = myArray[i];
            myArray[i] = temp;
        }

        for(int i : myArray){
            System.out.println(i);
        }
    }

    public static void QuickSort(){

        int numRows = 11; // You can change this to the desired number of rows

// Outer loop for rows
        for (int i = 0; i < numRows; i++) {

            // Inner loop for spaces before numbers
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print("  "); // Print double space for better formatting
            }

            // Inner loop for numbers
            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + "  "); // Print the number with double space
                number = number * (i - k) / (k + 1);
            }

            // Move to the next line after each row
            System.out.println();
        }


    }



}
