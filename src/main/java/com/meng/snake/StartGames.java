package main.java.com.meng.snake;

import javax.swing.*;

public class StartGames {
    public static void main(String[] args) {
        //绘制一个静态窗口JFrame
        JFrame frame = new JFrame("右右的贪吃蛇小游戏");
        frame.setBounds(10,10,900,720);//设置界面的大小
        frame.setResizable(false);//窗口大小则不可以改变
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭事件，游戏可以关闭了

        frame.add(new GamePanel());


        frame.setVisible(true);//窗口能够展现出来
    }
}
