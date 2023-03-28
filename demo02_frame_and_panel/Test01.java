package demo02_frame_and_panel;


import javax.swing.*;
import java.awt.*;

//mypanel
//我们自己的画板
public class Test01 extends JPanel {
    //2.自己画画

    @Override
    public void paint(Graphics g){
        g.drawLine(0,0,300,300);
    }
}
