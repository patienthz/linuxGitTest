package search;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int target = 100;

        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
