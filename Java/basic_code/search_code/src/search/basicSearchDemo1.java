package search;

public class basicSearchDemo1 {
    private static int[] arr;
    private static int number;

    public static void main(String[] args) {
        int[] arr = {111, 234, 48, 923, 467, 843, 81, 74, 87, 184, 787, 156, 87, 61};
        int number = 843;

        if (listsearch(arr, number)) {
            System.out.println("Found " + number);
        } else {
            System.out.println("Not found");
        }
    }

    private static boolean listsearch(int[] arr, int number) {
        basicSearchDemo1.arr = arr;
        basicSearchDemo1.number = number;
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
