package mylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);


        list.remove(1);

        System.out.println(list);

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int next = it.next();
            if (next == (int) 1) {
                it.add(4);
            }

        }

        System.out.println(list);
    }
}
