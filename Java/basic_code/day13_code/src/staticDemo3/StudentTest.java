package staticDemo3;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {

        //集合，存储学生对象
        ArrayList<Student> students = new ArrayList<>();

        //创建三个学生对象
        Student s1 = new Student("zhangsan",20,"male");
        Student s2 = new Student("lisi",23,"male");
        Student s3 = new Student("wangwu",27,"female");

        //把学生对象添加到集合中
        students.add(s1);
        students.add(s2);
        students.add(s3);

        //4.调用工具类的方法
        int getAge=StudentUtil.getMaxAgeStudent(students);

        System.out.println(getAge);

    }
}
