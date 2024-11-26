package bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {

        Random rand = new Random();
        BigInteger b = new BigInteger(4, rand);
        System.out.println(b);

        BigInteger b2 = new BigInteger("10", 2);
        System.out.println(b2);


        //对象一旦创建内部的数据不能发生改变
        BigInteger b3 = BigInteger.valueOf(1);
        BigInteger b4 = BigInteger.valueOf(2);
        BigInteger result = b3.add(b4);
        System.out.println(result);
    }
}
