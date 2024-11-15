package oopExtendsDemo3;

public class Manner extends Employee{

    private double bonus;

    public Manner() {

    }
    public Manner(String id , String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("work is to mannage others.");
    }

}
