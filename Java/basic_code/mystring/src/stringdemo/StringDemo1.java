package stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";

        System.out.println(s1 == s2);

        boolean result = s1.equals(s2);
        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
    }
}
