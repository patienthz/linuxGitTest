package polymorphismDemo1;

public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(18);
        s.setName("zhangsan");

        Teacher t = new Teacher();
        t.setAge(30);
        t.setName("lisi");

        Administrator a = new Administrator();
        a.setName("wangwu");
        a.setAge(20);

        register(s);
        register(t);
        register(a);


    }

    //既能接受老师，学生，又能接受管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
