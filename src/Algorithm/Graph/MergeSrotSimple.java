/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;

/**
 *
 * @author Sakib
 */




public class MergeSrotSimple {

    // Merges two subarrays of arr[]
    void merge(int arr[], int left, int mid, int right) {
        int l = mid - left + 1;
        int r = right - mid;

        int[] leftArray = new int[l];
        int[] rightArray = new int[r];

        // Copy data to temp arrays
        for (int i = 0; i < l; i++)
            leftArray[i] = arr[left + i];

        for (int j = 0; j < r; j++)
            rightArray[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0;
        int k = left;

        while (i < l && j < r) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < l) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < r) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using merge()
    void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort first and second halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Driver code
    public static void main(String args[]) {
        int[] arr = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};

        MergeSrotSimple ob = new MergeSrotSimple();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
Sample Output:
Sorted array:
23 23 23 34 45 65 67 89 90 101
*/