package abstructClass;

public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("dog eat bone");
    }

    @Override
    public void drink() {
        System.out.println("dog drink water");
    }
}
