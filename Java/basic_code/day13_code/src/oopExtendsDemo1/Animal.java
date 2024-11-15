package oopExtendsDemo1;

public class Animal {

    //Java中所有的类都直接或者间接继承于Object类
    //子类只能访问父类中非私有的成员
    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }

}

