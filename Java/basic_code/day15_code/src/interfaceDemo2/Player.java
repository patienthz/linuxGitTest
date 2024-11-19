package interfaceDemo2;

public abstract class Player extends Person {
    Player() {
        super();
    }

    Player(String name, int age) {
        super(name, age);
    }

    public abstract void play();
}
