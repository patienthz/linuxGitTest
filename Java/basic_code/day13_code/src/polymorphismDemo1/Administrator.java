package polymorphismDemo1;

public class Administrator extends Person {

    @Override
    public void show() {
        System.out.println("I am Administrator "+getName()+getAge());
    }
}
