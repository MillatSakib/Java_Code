/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;

/**
 *
 * @author Sakib
 */

public class QuickSortSimple {

    // Main method
    public static void main(String[] args) {
        int[] arr = {5, 9, 11, 15, 18, 20, 26};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("The sorted array is:");
        for (int value : arr) {
            System.out.println(value);
        }
    }

    // Function to perform Quick Sort
    static void quickSort(int[] arr, int beg, int end) {
        if (beg < end) {
            int loc = partition(arr, beg, end);
            quickSort(arr, beg, loc - 1);
            quickSort(arr, loc + 1, end);
        }
    }

    // Partition function
    static int partition(int[] arr, int beg, int end) {
        int pivot = arr[beg];
        int left = beg + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && arr[left] <= pivot) {
                left++;
            }
            while (right > beg && arr[right] > pivot) {
                right--;
            }
            if (left < right) {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // Swap pivot with arr[right]
        int temp = arr[beg];
        arr[beg] = arr[right];
        arr[right] = temp;

        return right;
    }
}