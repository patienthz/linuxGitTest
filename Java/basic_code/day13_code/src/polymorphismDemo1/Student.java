package polymorphismDemo1;

public class Student extends Person {

    @Override
    public void show() {
        System.out.println("I am student " + getName() + getAge());
    }
}
