package demo04_draw_digtal_image;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("数字绘画");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Mypanel mypanel =new Mypanel();
        mypanel.setPreferredSize(new Dimension(300,300));
        jFrame.add(mypanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
