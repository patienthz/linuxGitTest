package stringdemo;

import java.util.StringJoiner;

public class StringDemo4 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb =new StringBuilder();
        System.out.println(sb);
        sb.append("Hello");
        sb.append(1);
        sb.append('w');
        sb.append(true);
        sb.append(2.4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String sc = sb.toString();
        System.out.println(sc);
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("abc").add("def").add("ghi");
        System.out.println(sj.toString());
        System.out.println(sj.length());

    }
}
