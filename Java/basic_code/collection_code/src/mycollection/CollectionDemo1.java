package mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);
        System.out.println("----------------------------------------------------------");

//        coll.clear();
        System.out.println(coll);
        System.out.println("----------------------------------------------------------");

        boolean result = coll.contains("ccc");
        System.out.println(result);
        System.out.println("----------------------------------------------------------");

        boolean result2 = coll.isEmpty();
        System.out.println(result2);
        System.out.println("----------------------------------------------------------");

        coll.add("ddd");
        int size = coll.size();
        System.out.println(coll);
        System.out.println(size);
        System.out.println("----------------------------------------------------------");
    }
}
