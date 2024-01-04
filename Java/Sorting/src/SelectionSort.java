import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter array values to be sorted, each separated by a comma!");
        String inputString = myScanner.nextLine();
        String[] strArray = inputString.split(",");
        int[] intArray = new int[strArray.length];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        SelectionSort(intArray);
    }

    public static void SelectionSort(int[] array){
        int[] myArray = array;

        //Starting at the first element in the array,
        //we step through the array and locate the index
        //of the lowest element. We then put this in its correct
        //position in the array.
        for(int i = 0; i < myArray.length; i++){
            int lowestIdx = i;
            for(int j = i+1; j < myArray.length; j++){
                if(myArray[j] < myArray[lowestIdx]){
                    lowestIdx = j;
                }
            }
            swap(myArray, lowestIdx, i);
        }

        for(int i : myArray){
            System.out.println(i);
        }
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
