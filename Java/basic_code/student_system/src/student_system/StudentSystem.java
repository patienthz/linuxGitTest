package student_system;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {

        boolean exitFlag = false;
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            if (exitFlag) {
                break;
            }
            //init
            System.out.println("-------------欢迎来到学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入选择：");

            //输入
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    addStudent(students);
                    break;
                case "2":
                    deleteStudent(students);
                    break;
                case "3":
                    updateStudent(students);
                    break;
                case "4":
                    searchStudent(students);
                    break;
                case "5":
                    System.out.println("退出");
                    exitFlag = true;
                    //System.exit(0);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }


    //添加学生
    public static void addStudent(ArrayList<Student> students) {
        System.out.println("请开始添加学生");
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        for (int i = 0; ; i++) {
            System.out.println("输入学生id");
            String id = scanner.next();
            System.out.println("输入学生姓名");
            String name = scanner.next();
            System.out.println("输入学生年龄");
            int age = scanner.nextInt();
            System.out.println("输入学生家庭住址");
            String address = scanner.next();
            student.setId(id);
            student.setName(name);
            student.setAge(age);
            student.setAddress(address);
            if (students.contains(student)) {
                System.out.println("学生已存在");
            } else {
                students.add(student);
                System.out.println("id:" + student.getId() + "的学生已成功被添加");
            }
            System.out.println("请执行操作：\n1.录入下一个学生;\n2.退出");
            String choice = scanner.next();
            if (choice.equals("1")) {
                continue;
            } else if (choice.equals("2")) {
                break;
            } else {
                System.out.println("error!");
                break;
            }
        }

    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> students) {
        System.out.println("请输入删除学生id");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        boolean flagDelete = false;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId().equals(id)) {
                students.remove(student);
                flagDelete = true;
                System.out.println("id:" + student.getId() + "已删除");
                break;
            } else {
                continue;
            }
        }
        if (!flagDelete) {
            System.out.println("id:" + id + "不存在");
        }

    }

    //修改学生
    public static void updateStudent(ArrayList<Student> students) {
        System.out.println("开始修改学生的id：");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        boolean flagUpdate = false;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId().equals(id)) {
                System.out.println("已找到该学生信息：");
                System.out.println("姓名：" + student.getName() + "\t年龄：" + student.getAge() + "\t地址：" + student.getAddress());
                System.out.println("请输入需要修改的信息：\t1.姓名   2.年龄    3.地址");

                boolean flagExit = false;
                while (true) {
                    if (!flagExit) {
                        String choice = scanner.next();
                        if (choice.equals("1")) {
                            System.out.println("请输入新的姓名：");
                            student.setName(scanner.next());
                            System.out.println("已修改完成，新的姓名为" + student.getName());
                        } else if (choice.equals("2")) {
                            System.out.println("请输入新的年龄：");
                            student.setAge(scanner.nextInt());
                            System.out.println("已修改完成，新的年龄为" + student.getAge());
                        } else if (choice.equals("3")) {
                            System.out.println("请输入新的地址：");
                            student.setAddress(scanner.next());
                            System.out.println("已修改完成，新的地址为" + student.getAddress());
                        } else {
                            System.out.println("error!please input again");
                            break;
                        }
                        System.out.println("是否继续修改");
                        System.out.println("1.不修改\t2.修改");
                        String choice1 = scanner.next();
                        if (choice1.equals("1")) {
                            flagExit = true;
                        }
                    } else {
                        break;
                    }
                }
                System.out.println("已修改完成");
                flagUpdate = true;
                break;
            }
        }
        if (!flagUpdate) {
            System.out.println("id:" + id + "不存在");
        } else {
            System.out.println("修改后的学生信息");
            searchStudent(students);
        }
    }

    //查询学生
    public static void searchStudent(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("请添加后查询");
        }
        System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
        for (Student student : students) {
            System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getAddress());
        }
    }

    //注册功能
    public static boolean signIn(User user) {

        //Init
        System.out.println("欢迎注册学生管理系统----------------------------");
        Scanner scanner = new Scanner(System.in);

        //username
        System.out.println("请输入注册用户名");
        String username = scanner.next();
        user.setUsername(username);

        //password
        System.out.println("请输入注册密码");
        String inputPassword1 = scanner.next();
        System.out.println("请再次输入注册密码");
        String inputPassword2 = scanner.next();
        if (inputPassword1.equals(inputPassword2)) {
            user.setPassword(inputPassword1);
        } else {
            System.out.println("两次密码不一致");
            return false;
        }

        //idNumber
        System.out.println("请输入注册身份证号码");
        String id = scanner.next();
        user.setId(id);

        //PhoneNumber
        System.out.println("请输入注册手机号码");
        String phone = scanner.next();
        user.setPhone(phone);

        System.out.println(user.getUsername()+"用户注册成功！");
        return true;
    }

    //登录功能
    public static boolean Login(User user) {



        return true;
    }

}
