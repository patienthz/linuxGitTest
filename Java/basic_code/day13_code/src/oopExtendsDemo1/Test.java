package oopExtendsDemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        //1.创建Ragdoll的对象
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.sleep();
        rd.CatchMouse();

        System.out.println("----------------------------------");
        //2.创建哈士奇的对象
        Husky hk = new Husky();
        hk.eat();
        hk.sleep();
        hk.bark();
        hk.lookHome();
    }
}
