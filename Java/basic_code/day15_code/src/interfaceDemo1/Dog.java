package interfaceDemo1;

public class Dog extends Animal implements Swim{

    public Dog(){
        super();
    }
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getAge()+" year‘s "+this.getName()+" eat bone. ");
    }

    @Override
    public void swim() {
        System.out.println(this.getAge()+" year‘s "+this.getName()+" can doggy paddle swimming ");
    }
}
