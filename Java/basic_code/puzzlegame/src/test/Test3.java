package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {

        //界面设置
        JFrame frame = new JFrame();

        frame.setSize(603, 680);

        frame.setTitle("事件演示");

        frame.setAlwaysOnTop(true);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(null);

        //设置按钮对象
        JButton jbt = new JButton("点");
        jbt.setBounds(0, 0, 100, 50);
//        jbt.addActionListener(new MyActionListener());

        jbt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(actionEvent.getActionCommand());
            }
        });

        frame.getContentPane().add(jbt);

        frame.setVisible(true);


    }
}
