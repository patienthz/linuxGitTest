package stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //定义大写字母，消协字母和数字次数
        int CntUpperCase = 0;
        int CntLowerCase = 0;
        int CntNumber = 0;
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.进行遍历
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                CntUpperCase++;
            }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                CntLowerCase++;
            }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                CntNumber++;
            }
        }
        System.out.printf("CntUpperCase:%d,CntLOwerCase:%d,CntNumber:%d.", CntUpperCase, CntLowerCase, CntNumber);

    }
}
