public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort();
    }

    public static void SelectionSort(){
        int[] myArray = new int[]{12,3,2,4,5,1,123,66,43,54,78,89,96,43,22,11};

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
