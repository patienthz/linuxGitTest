package oopExtendsDemo3;

public class Cook extends Employee {

    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("work is cooking");
    }
}
