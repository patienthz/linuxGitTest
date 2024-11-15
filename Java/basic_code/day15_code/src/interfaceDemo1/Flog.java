package interfaceDemo1;

public class Flog extends Animal implements Swim {
    public Flog() {
        super();
    }
    public Flog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getAge()+" year‘s "+this.getName()+" eat insert. ");
    }

    @Override
    public void swim() {
        System.out.println(this.getAge()+" year‘s "+this.getName()+" can breaststroke ");
    }
}
