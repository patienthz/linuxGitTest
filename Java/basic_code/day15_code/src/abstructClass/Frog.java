package abstructClass;

public class Frog extends Animal {

    public Frog() {
        super();
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("frog eat insert");
    }

    @Override
    public void drink() {
        System.out.println("frog drink water");
    }
}
