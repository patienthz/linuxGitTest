package sort;

import java.util.Arrays;

public class SelectionDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 1};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
