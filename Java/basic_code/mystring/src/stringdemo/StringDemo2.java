package stringdemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {

        //1.定义两个变量用户名和密码
        String s1 = "patient";
        String s2 = "15hcfvn";

        for (int i = 0; i < 3; i++) {
            //2.实现模拟用户登录
            Scanner info = new Scanner(System.in);
            System.out.println("please input your id:");
            String id = info.nextLine();
            System.out.println("please input your password:");
            String password = info.nextLine();

            //3.比较
            if (s1.equals(id) && s2.equals(password)) {
                System.out.println("user account successfully.");
                break;
            }else {
                System.out.println("user account not match.");
            }

        }


    }
}
