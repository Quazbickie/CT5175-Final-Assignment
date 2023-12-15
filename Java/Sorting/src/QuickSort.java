public class QuickSort {

    public static void main(String[] args) {
        int[] myArray = new int[]{78,33,22,55,44,99,4,67,100,2,3,-34};
        qsort(myArray, 0, myArray.length-1);
        for(int i : myArray){
            System.out.println(i);
        }
    }

    public static void qsort(int[] array, int low, int high){
        if(low >= high){
            return;
        }

        int pivot = array[high];
        int leftPointer = low;
        int rightPointer = high;

        while(leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, high);
        qsort(array, low, leftPointer-1);
        qsort(array, leftPointer+1, high);

    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
