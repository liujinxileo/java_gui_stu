package demo02_frame_and_panel;

import javax.swing.*;
import java.awt.*;

public class text {
    public static void main(String[] args) {
        //1.JFrame 框架，没有框架，new一个框架，title是窗体的名称
        JFrame frame = new JFrame("黑马小框架");//ctrl+p
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//固定套路，代表带点击叉号彻底退出程序

        //2.把刚才画好的内容，镶嵌到这个窗体里面
        Test01 panel =new Test01();/*test01是根据前一个class文件明明的*/

        panel.setPreferredSize(new Dimension(300,300));//设置面板的大小

        frame.add(panel);//把面板镶嵌到骨架里面

        frame.pack();//根据面板的大小计算骨架大小
        //3.挂出来给别人看
        frame.setVisible(true);

    }
}
