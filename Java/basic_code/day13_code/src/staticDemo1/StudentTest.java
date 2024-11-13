package staticDemo1;

public class StudentTest {
    public static void main(String[] args) {

        Student.teacherName = "Tom";
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(18);
        s1.setGender("male");
        //s1.teacherName = "Tom";

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(20);
        s2.setGender("female");

        s2.study();
        s2.show();
    }
}
