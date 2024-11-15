package polymorphismDemo2;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(super.getAge() + "岁的" + super.getColor() + "颜色的猫咪着眼睛侧着头吃" + something);
    }

    public void lookHome() {
        System.out.println("I am looking home.");
    }

}
