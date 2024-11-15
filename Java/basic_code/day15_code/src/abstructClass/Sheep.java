package abstructClass;

public class Sheep extends Animal {

    public Sheep() {
        super();

    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("abstructClass.Sheep eat grass");
    }

    @Override
    public void drink() {
        System.out.println("abstructClass.Sheep drink water");
    }
}
