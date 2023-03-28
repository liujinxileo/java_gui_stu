package demo04_draw_digtal_image;

import javax.swing.*;
import java.awt.*;

public class Mypanel extends JPanel {
    @Override
    public void paint(Graphics g){
        //对抗锯齿
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        for(int i = 0; i < 30; i++ ){
        g2d.drawLine(0,0,0+i*10,300-i*10);
    }   }
}
