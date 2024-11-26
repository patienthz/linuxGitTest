package search;

import java.util.ArrayList;

public class basicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {111, 234, 48, 923, 467, 843, 81, 74, 87, 843, 787, 156, 87, 61};
        int number = 843;

        ArrayList<Integer> list = new ArrayList<>();
        list = listsearch(arr, number);
        System.out.println(list);
    }

    private static ArrayList<Integer> listsearch(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            list.add(-1);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    list.add(i);
                }
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }
}
