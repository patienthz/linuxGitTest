package lambda;

public class lambdaDemo {
    public static void main(String[] args) {
        method(
                () -> {
                    System.out.println("swimming");
                }
        );
    }

    public static void method(Swim s) {
        s.swimming();
    }

}


@FunctionalInterface
interface Swim {
    public abstract void swimming();
}