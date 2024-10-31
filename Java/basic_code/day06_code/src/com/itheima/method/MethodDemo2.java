package com.itheima.method;

import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input first param a:");
        int a = scanner.nextInt();
        System.out.println("please input second param b:");
        int b = scanner.nextInt();
        System.out.println("output is :");
        double out=SumMethod(a,b);
        System.out.println(out);
        scanner.close();
    }
    public static double SumMethod(int param1,int param2) {
        int sum=param1+param2;
//        System.out.println(sum);
        return (double)(sum);

    }
}
