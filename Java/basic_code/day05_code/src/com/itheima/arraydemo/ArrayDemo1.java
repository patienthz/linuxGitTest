package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义数组存储五个学生年龄
        int[] arr1 = new int[]{11,12,13,14,15};
        int[] arr2 = new int[]{11,12,13,14,15};

        String[] arr3 = new String[]{"zhangsan","lisi","wangwu"};
        String[] arr4 = new String[]{"zhangsan","wangwu"};

        double[] arr5 = new double[]{11.2,12.3,13.9,14,15};
        double[] arr6 = {11.2,12.3,13.9};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println(arr2);



    }
}
