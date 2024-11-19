package interfaceDemo2;

public class PingpangCoach extends Coach implements SpeakLanguage {
    public PingpangCoach() {
        super();
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(this.getAge() + " year's " + this.getName() + " teach pingpang.");
    }

    @Override
    public void speak(String language) {
        System.out.println(this.getName() + " can speak " + language);
    }
}
