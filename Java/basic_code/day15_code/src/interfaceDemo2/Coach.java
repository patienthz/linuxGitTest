package interfaceDemo2;

public abstract class Coach extends Person {
    public Coach() {
        super();
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
