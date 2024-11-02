package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("please input array:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] arr = input.split(" ");
        int[] src = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            src[i] = Integer.parseInt(arr[i]);
        }
        System.out.println("please input start:");
        Scanner sc1 = new Scanner(System.in);
        int start = sc1.nextInt();
        System.out.println("please input end:");
        int end = sc1.nextInt();
        sc1.close();


        int[] target =copyOfRange(src, start, end);
        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] src, int start, int end) {
        int[] target = new int[end - start];
        for (int i = start; i < end; i++) {
            target[i - start] = src[i];
        }
        return target;

    }
}
