package polymorphismDemo2;

public class Person {
    private String name;
    private int age;

    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal pet,String something){
        String type;
        if(pet instanceof Cat cat){
            type = "猫";
            cat.lookHome();
        }else if(pet instanceof Dog dog){
            type = "狗";
            dog.catchMouse();
        }else {
            type = "unknown animal";
        }
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+pet.getColor()+"颜色的"+pet.getAge()+"岁的"+type);
        pet.eat(something);
    }


}
