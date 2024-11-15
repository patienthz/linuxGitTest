package oopExtendsDemo2;



public class DogTest {
    public static void main(String[] args) {
        Hasky h = new Hasky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        System.out.println("---------------------------------------------");
        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();

        System.out.println("---------------------------------------------");
        Shapy sh = new Shapy();
        sh.eat();
        sh.drink();
        sh.lookHome();

    }
}
