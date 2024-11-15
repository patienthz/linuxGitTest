package interfaceDemo1;

public class Rabbit extends Animal{

    public Rabbit() {
        super();
    }
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getAge()+" year‘s "+this.getName()+" eat carrot. ");
    }

}
