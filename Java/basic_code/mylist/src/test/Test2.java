package test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Integer> list = new ArrayList<Integer>();

        //2.添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.print("]");


    }
}
