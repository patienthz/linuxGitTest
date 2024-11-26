package mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {

        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 20);
        Student s3 = new Student("wangwu", 22);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student("wangwu", 22);
        boolean result = coll.contains(s4);
        System.out.println(result);
    }
}
