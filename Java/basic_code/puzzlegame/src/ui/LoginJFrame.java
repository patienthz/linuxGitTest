package ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //LoginJFrame表示登录界面
    //登录有关的代码

    public LoginJFrame() {
        //创建登录页面时，同时给页面一些设置信息
        //比如宽高或者展示
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("拼图登录界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭效果
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

}
