import ui.GameJFrame;
import ui.LoginJFrame;
import ui.RegisterJFrame;

public class App {
    public static void main(String[] args) {
        //表示程序的启动入口

        //想开启下一个页面，就创建对象就可以了

        new LoginJFrame();
        new RegisterJFrame();
        new GameJFrame();
    }
}
