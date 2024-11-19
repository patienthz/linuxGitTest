package interfaceDemo2;

public class Test {
    public static void main(String[] args) {

        PingpangPlayer pp = new PingpangPlayer("pingpang player",24);
        PingpangCoach pc = new PingpangCoach("pingpang coach",40);
        BasketballPlayer bp = new BasketballPlayer("basketball player",22);
        BasketballCoach bc = new BasketballCoach("basketball coach",59);

        pp.play();
        pp.speak("English");

        System.out.println("-------------------------------");
        pc.teach();
        pc.speak("Engliash");

        System.out.println("-------------------------------");
        bp.play();

        System.out.println("-------------------------------");
        bc.teach();

    }
}
