package abstructClass;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog();
        Dog d = new Dog();
        Sheep sheep = new Sheep("sheep", 20);

        f.setName("abstructClass.Frog");
        f.setAge(20);
        d.setName("abstructClass.Dog");
        d.setAge(16);
        sheep.setName("abstructClass.Sheep");
        sheep.setAge(17);


        f.eat();
        f.drink();

        d.eat();
        d.drink();

        sheep.eat();
        sheep.drink();

    }
}
