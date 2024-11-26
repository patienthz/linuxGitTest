package mylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");


        list.add(1,"QQQ");

        String remove = list.remove(1);
        System.out.println(remove);


        System.out.println(list);
    }
}
