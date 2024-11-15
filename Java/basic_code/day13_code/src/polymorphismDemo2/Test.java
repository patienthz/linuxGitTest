package polymorphismDemo2;

public class Test {
    public static void main(String[] args) {
        Animal pet1 = new Cat(3,"灰");
        Animal pet2 = new Dog(2,"黑");


        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);
        p2.keepPet(pet1,"鱼");
        p1.keepPet(pet2,"骨头");







    }
}
