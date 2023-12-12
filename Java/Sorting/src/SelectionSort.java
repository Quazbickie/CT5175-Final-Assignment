public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort();
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


}
