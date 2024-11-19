package interfaceDemo2;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
        super();
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(this.getAge() + " year's " + this.getName() + " teach basketball.");
    }
}
