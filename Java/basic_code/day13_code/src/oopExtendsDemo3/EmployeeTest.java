package oopExtendsDemo3;

public class EmployeeTest {
    public static void main(String[] args) {
        Manner m = new Manner("001","zhangsan",3000,4000);
        System.out.println(m.getSalary()+m.getId()+m.getName()+m.getSalary());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("002");
        c.setName("lisi");
        c.setSalary(10000);

        System.out.println(c.getSalary()+c.getId()+c.getName());
        c.work();
        c.eat();
    }
}
