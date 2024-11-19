package test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {

    JButton jbt1 = new JButton("button1");

    public MyJFrame2() {
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图登录界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭效果
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(null);
        //给按钮设置宽高
        jbt1.setBounds(0, 0, 100, 50);
        //给按钮绑定鼠标事件
        jbt1.addMouseListener(this);


        this.getContentPane().add(jbt1);

        this.setLayout(null);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        System.out.println("mouseExited");
    }
}
