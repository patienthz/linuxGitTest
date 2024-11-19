package ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册相关的代码
    public RegisterJFrame() {
        this.setSize(488, 500);
        //设置界面标题
        this.setTitle("拼图注册界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭效果
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
