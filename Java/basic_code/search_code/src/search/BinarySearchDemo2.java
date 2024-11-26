package search;

public class BinarySearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 10, 44, 50, 64, 88, 98, 198, 1000};
        int number = 999;
        System.out.println(binarySearch(arr, number));

    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int pos;
        if (target < arr[low] || target > arr[high]) {
            return -1;
        }
        while (low <= high) {
            //避免分母是0
            if (arr[low] == arr[high]) {
                if (target == arr[low]) {
                    return low;
                } else {
                    return -1;
                }
            }
            //计算位置
            pos = low + (high - low) * (target - arr[low]) / (arr[high] - arr[low]);

            //检查是否目标值并调整
            if (arr[pos] == target) {
                return pos;
            } else if (arr[pos] > target) {
                high = pos - 1;
            } else if (arr[pos] < target) {
                low = pos + 1;
            }
        }


        return -1;

    }

}
