package oopExtendsDemo2;

public class Shapy extends Dog {

    @Override
    public void eat() {
        super.eat();
        System.out.println("狗啃骨头");
    }
}
