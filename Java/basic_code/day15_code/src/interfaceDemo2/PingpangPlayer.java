package interfaceDemo2;

public class PingpangPlayer extends Player implements SpeakLanguage {
    public PingpangPlayer() {
        super();
    }

    public PingpangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(this.getAge() + " year's " + this.getName() + " play pingpang.");
    }

    @Override
    public void speak(String language) {
        System.out.println(this.getName() + " can speak " + language);
    }
}
