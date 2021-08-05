package main.java.com.meng.snake;

import javax.swing.*;
import java.net.URL;

//存放外部数据
public class Data {
    //头部的图片 URL:定位图片的位置  ImageIcon:图片
    public static URL headURL = Data.class.getResource("/static/");
    public static ImageIcon head = new ImageIcon(headURL);
    //头部
    public static URL upURL = Data.class.getResource("/static/");
    public static URL downURL = Data.class.getResource("/static/");
    public static URL leftURL = Data.class.getResource("/static/");
    public static URL rightURL = Data.class.getResource("/static/");
    public static ImageIcon up = new ImageIcon(upURL);
    public static ImageIcon  down= new ImageIcon(downURL);
    public static ImageIcon left = new ImageIcon(leftURL);
    public static ImageIcon right = new ImageIcon(rightURL);
    //身体
    public static URL bodyURL = Data.class.getResource("/static/");
    public static ImageIcon body = new ImageIcon(bodyURL);
    //食物
    public static URL foodURL = Data.class.getResource("/static/");
    public static ImageIcon food= new ImageIcon(foodURL);
}
