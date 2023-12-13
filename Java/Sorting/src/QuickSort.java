public class QuickSort {

    public static void main(String[] args) {
        int[] myArray = new int[]{78,33,22,55,44,99,4,67,100,2};
        qs(myArray, 0, myArray.length-1);
        for(int i : myArray){
            System.out.println(i);
        }
    }

    public static void qs(int[] array, int low, int high){

        if(low >= high){
            return;
        }

        int pivotIndex = array.length - 1;
        int pivot = array[pivotIndex];
        int temp = array[pivotIndex];
        array[pivotIndex] = array[high];
        array[high] = temp;
        int leftPointer = partition(array, low, high, pivot);



        qs(array, low, leftPointer-1);
        qs(array, leftPointer+1, high);


    }

    public static int partition(int[] array, int low, int high, int pivot){

        int leftPointer = low;
        int rightPointer = high-1;

        while(leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            int temp = array[leftPointer];
            array[leftPointer] = array[rightPointer];
            array[rightPointer] = temp;

        }

        if(array[leftPointer] > array[high]) {
            int temp = array[leftPointer];
            array[leftPointer] = array[high];
            array[high] = temp;
        } else {
            leftPointer = high;
        }

        return leftPointer;

    }

}
