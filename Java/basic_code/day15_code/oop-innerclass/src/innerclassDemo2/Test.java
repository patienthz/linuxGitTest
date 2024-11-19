package innerclassDemo2;

public class Test {
    public static void main(String[] args) {


        //可以理解为一个Swim接口的实现类对象
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法：蝶泳");
            }
        };
        //编译看左边，运行看右边
        goSwimming(s);

        goSwimming(new Swim() {
            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法：仰泳");
            }
        });

    }

    //定义一个方法，模拟请一些人去游泳
    public static void goSwimming(Swim s) {
        s.swim();
    }
}
