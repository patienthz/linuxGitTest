package sort;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {1, 1, 6, 2, 7, 9, 3, 4, 5, 1, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (arr == null || arr.length < 2) {
            return;
        }


        int start = left;
        int end = right;
        if (left >= right) {
            return;
        }

        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < arr[left]) {
                    break;
                }
                end--;
            }
            while (true) {
                if (end <= start || arr[start] > arr[left]) {
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[start];
        arr[start] = arr[left];
        arr[left] = temp;

        quickSort(arr, left, start - 1);
        quickSort(arr, end + 1, right);
    }
}
