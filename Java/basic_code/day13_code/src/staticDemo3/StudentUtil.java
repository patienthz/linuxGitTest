package staticDemo3;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil() {
    }

    public static int getMaxAgeStudent(ArrayList<Student> students) {

        //1.定义一个参照物
        int maxAge = students.get(0).getAge();

        //2.循环遍历集合
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getAge() > maxAge) {
                maxAge = students.get(i).getAge();
            }
        }
        return maxAge;
    }
}
