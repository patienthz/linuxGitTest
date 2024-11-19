package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame implements ActionListener {
    JButton jbt1 = new JButton("1");
    JButton jbt2 = new JButton("2");
    public MyJFrame() {
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


        jbt1.setBounds(0, 0, 100, 50);
        jbt1.addActionListener(this::actionPerformed);


        jbt2.setBounds(100, 0, 100, 50);
        jbt2.addActionListener(this::actionPerformed);

        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //获取当前被操作的按钮对象
        Object source = actionEvent.getSource();

        if (source == jbt1) {
            jbt1.setText("change jbt1");
        }else if (source == jbt2) {
            jbt2.setText("change jbt2");
        }

    }
}
