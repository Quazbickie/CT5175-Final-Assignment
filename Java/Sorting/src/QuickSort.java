public class QuickSort {

    public static void main(String[] args) {
        int[] myArray = new int[]{78,33,22,55,44,99,4,67,100,2,3,-34};
        qsort(myArray, 0, myArray.length-1);
        for(int i : myArray){
            System.out.println(i);
        }
    }


    public static void qsort(int[] array, int low, int high){

        //'Base Case'
        //if the low element is equal or greater
        //than the high element then it is time to
        //return
        if(low >= high){
            return;
        }

        //set pivot element as the 'high' index in the array
        //The pivot element is important in quicksort. After each partition, or
        //iteration, the pivot element will be in its correct and final position
        //in the array.
        int pivot = array[high];

        //set left and right pointers to low and high element respectively.
        int leftPointer = low;
        int rightPointer = high;

        //We have a left and right pointer, each at opposite ends of the array
        //we are going to increment the leftpointer until we find an element that is
        //greater than the pivot element. Once we find this element, or we meet the rightpointer,
        //we stop.
        //Then we are going to decrement the rightpointer until we find an element that is
        //less than the pivot element. Once we find this element, or we meet the leftpointer,
        //we stop.
        //We then swap the elements the left and right pointer are pointing to.
        while(leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }

        //then we put the pivot element in its correct and final position in the array
        swap(array, leftPointer, high);

        //recursively call this method on each side of the array,
        //from index 0 to the leftpointer
        //and from the leftpointer+1 to the last index
        //Essentially, the large array is segmented into smaller arrays,
        //each of which will be sorted using the above methods.
        qsort(array, low, leftPointer-1);
        qsort(array, leftPointer+1, high);

    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
