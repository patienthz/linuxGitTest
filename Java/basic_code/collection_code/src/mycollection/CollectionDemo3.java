package mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
    public static void main(String[] args) {
//        迭代器遍历相关的三个方法：
//        Iterator<E> iterator()    :获取一个迭代器对象
//        boolean hasNext() :判断当前指向的位置是否有元素
//        E next()  :获取当前指向的元素并移动指针


        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

//        2.获取迭代器对象
//        迭代器好比是一个箭头默认指向集合的0索引处
        for (String s : coll) {
            System.out.println(s);
        }

//        System.out.println(it.hasNext());
//        System.out.println(it.hasNext());


    }
}
