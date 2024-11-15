package interfaceDemo1;

public class Test {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("rabbit", 2);
        Flog f = new Flog("flog", 3);
        Dog d = new Dog("dog", 4);

        r.eat();
        System.out.println("-----------------------------------------");

        f.eat();
        f.swim();
        System.out.println("-----------------------------------------");

        d.eat();
        d.swim();

    }
}
