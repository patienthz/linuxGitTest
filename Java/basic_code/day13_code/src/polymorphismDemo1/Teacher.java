package polymorphismDemo1;

public class Teacher extends Person {

    @Override
    public void show() {
        System.out.println("I am Teacher " + getName() + getAge());
    }
}
