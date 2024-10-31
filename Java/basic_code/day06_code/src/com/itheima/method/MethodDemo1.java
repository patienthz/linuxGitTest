package com.itheima.method;

import java.util.Scanner;

public class MethodDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input int array,use black to split:");

        String input = sc.nextLine();
        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        method1(arr);
        sc.close();
    }

    public static void method1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d,",i,arr[i]);
        }

    }
}
