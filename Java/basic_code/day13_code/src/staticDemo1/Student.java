package staticDemo1;

public class Student {
    //属性：姓名 年龄 性别
    private String name;
    private int age;
    private String gender;

    //static 表示静态，是一个修饰符号，可以修饰成员方法和成员变量
    //- 修饰成员变量，叫做静态变量
    //特点：
    //1.被该类所有对象共享
    //2.不属于对象，属于类
    //3.随着类的加载而加载，优先于对象存在
    //调用方法：使用类名调用
    public static String teacherName;


    public Student() {

    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //行为
    public void study() {
        System.out.println(name + " is studying");
    }

    public void show() {
        System.out.println(name + "," + age + "," + gender + "," + teacherName);

    }
}
