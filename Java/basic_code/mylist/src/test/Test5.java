package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //1.创建对象
        ArrayList<Student> list = new ArrayList<>();

        //2.键盘录入学生信息
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("输入学生姓名：");
            String name = scanner.next();
            System.out.println("请输入学生年龄");
            int age = scanner.nextInt();
            s.setName(name);
            s.setAge(age);
            //3.把内容放进集合中
            list.add(s);
        }

        //3.遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i).getName()+":"+list.get(i).getAge());
            }else {
                System.out.print(list.get(i).getName()+":"+list.get(i).getAge()+",");
            }
        }
        System.out.println("]");
    }
}
