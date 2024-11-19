package ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //规定GameJFrame这个界面便是的是游戏的主界面
    //和游戏相关的所有逻辑都写在这个类中

    //创建一个二维数组
    int[][] data = new int[4][4];
    //记录空白方块在二维数组的位置
    int x, y;
    //定义一个变量，记录当前展示图片的路径
    String path = "puzzlegame/image/animal/animal3/";
    //定义一个二位数组，存储正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    //定义变量 步数
    int count = 0;

    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {
        //初始化界面
        initJF();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initData();

        //初始化图片
        initImage();

        //显示
        this.setVisible(true);
    }

    //初始化数据
    private void initData() {
        //1.定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //2.打乱数组中的数据的顺序
        //遍历数组，得到一个元素，拿着一个元素跟随机索引的数据交换
        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取随机索引
            int index = random.nextInt(tempArr.length);
            //交换
            int temp = tempArr[index];
            tempArr[index] = tempArr[i];
            tempArr[i] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片
    private void initImage() {

        //清空原本已经有的图片
        this.getContentPane().removeAll();

        if (victory()) {
            //显示胜利的图标
            JLabel winLabel = new JLabel(new ImageIcon("puzzlegame/image/win.png"));
            winLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winLabel);
        }

        JLabel stepCountLabel = new JLabel("步数" + count);
        stepCountLabel.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCountLabel);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取data数组中的编号
                int number = data[i][j];
                //创建一个图片ImageIcon对象
                ImageIcon icon = new ImageIcon(path + number + ".jpg");
                //创建一个Jlabel对象(管理容器)
                JLabel label = new JLabel(icon);
                //指定图片位置
                label.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //边框
                label.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(label);
            }
        }
        //背景图片
        ImageIcon iconBg = new ImageIcon("puzzlegame/image/background.png");
        JLabel bg = new JLabel(iconBg);
        bg.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面中
        this.getContentPane().add(bg);

        //刷新界面
        this.getContentPane().repaint();
    }

    //初始化菜单
    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar menuBar = new JMenuBar();

        //创建菜单的两个选项对象(功能，关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");


        //添加选项到条目中去
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //将菜单两个选项添加到菜单中
        menuBar.add(functionJMenu);
        menuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(menuBar);
    }

    //初始化界面
    private void initJF() {
        //设置游戏的宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭效果
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //取消默认的剧中放置，只有取消了才会按照xy轴形式进行添加图片
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    //按下不松时会调用这个方法
    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int code = keyEvent.getKeyCode();
        if (code == KeyEvent.VK_A) {
            //把界面所有图片都删除
            this.getContentPane().removeAll();
            //加载第一张完美图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            //背景图片
            ImageIcon iconBg = new ImageIcon("puzzlegame/image/background.png");
            JLabel bg = new JLabel(iconBg);
            bg.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面中
            this.getContentPane().add(bg);
            //刷新界面
            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (victory()) {
            return;
        }
        //对上下左右进行判断
        int code = keyEvent.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            System.out.println("向左");
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            count++;
            initImage();
        } else if (code == KeyEvent.VK_RIGHT) {
            System.out.println("向右");
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            count++;
            initImage();
        } else if (code == KeyEvent.VK_UP) {
            System.out.println("向上");
            if (x == 3) {
                return;
            }
            //把空白方块下方的数字赋值给空白方块
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            count++;
            initImage();
        } else if (code == KeyEvent.VK_DOWN) {
            System.out.println("向下");
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            count++;
            initImage();
        } else if (code == KeyEvent.VK_A) {
            initImage();
        } else if (code == KeyEvent.VK_W) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    //判断data和win中数组是否相同
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();

        if (source == replayItem) {
            System.out.println("重新游戏");
            //计步器清零
            count = 0;
            //再次打乱二维数组的数据
            initData();
            //重新加载图片
            initImage();
        } else if (source == reLoginItem) {
            System.out.println("重新登录");
            //关闭当前游戏界面
            this.setVisible(false);
            //新建登录
            new LoginJFrame();
        } else if (source == closeItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机
            System.exit(0);
        } else if (source == accountItem) {
            System.out.println("公众号");
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //创建一个容器
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame/image/about.png"));
            //设置位置和宽高
            jLabel.setBounds(0, 0, 258, 258);
            //将图片添加到弹框中
            jDialog.getContentPane().add(jLabel);
            //设置弹框大小
            jDialog.setSize(344, 344);
            //设置弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭无法操作下面界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
        }
    }
}
