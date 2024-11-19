package interfaceDemo2;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
        super();
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(this.getAge() + " year's " + this.getName() + " play basketball.");
    }
}
