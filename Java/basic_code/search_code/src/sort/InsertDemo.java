package sort;

import java.util.Arrays;

public class InsertDemo {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 44, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(insertSort(arr)));
    }

    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
