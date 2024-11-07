package listdemo;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合的对象
        //泛型：用于限定集合中存储数据的类型

        //创建的是ArrayList的对象，而ArrayList是Java已经写好的类
        //打印不是地址值，而是集合中存储数据的内容
        //在展示的时候会用[]”包住
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list);


    }
}
