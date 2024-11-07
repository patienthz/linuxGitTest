package test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.创建学生对象
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 20);
        Student s3 = new Student("wangwu", 22);

        //3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.遍历
        System.out.print("[");
        for(int i=0;i<list.size();i++){
            if(i == list.size()-1){
                System.out.print(list.get(i).getName()+":"+list.get(i).getAge());
            }else {
                System.out.print(list.get(i).getName()+":"+list.get(i).getAge()+",");
            }
        }
        System.out.println("]");

    }
}
