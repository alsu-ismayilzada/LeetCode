package sorting.quicksort;

import static sorting.quicksort.QuickSort.printArr;
import static sorting.quicksort.QuickSort.quickSort;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = { 3, 7, 8, 9, 1, 5 };
        int N = arr.length;

        // Function call
        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }
}
