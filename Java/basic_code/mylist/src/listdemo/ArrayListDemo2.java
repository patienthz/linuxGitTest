package listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加一个元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

//        //3.删除元素
//        list.remove("ddd");
//
//        String str = list.remove(1);
//        System.out.println(str);
//
//        //4.修改元素
//        String str2 = list.set(1,"eee");
//        System.out.println(str2);

        //5.查询元素
        String str3 = list.get(1);
        System.out.println(str3);

        //6.获取size()
        int size = list.size();
        System.out.println(size);

        System.out.println(list);
    }
}
