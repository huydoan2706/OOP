package HippocampusChess.HOME;

import java.awt.*;

public class VerticalHome extends Home {
    @Override
    public void paint(Graphics2D g2d){
        g2d.setColor(Color.RED);
        g2d.fillRect(250, 60, Vertical_Width, Horizontal_Width);
        g2d.setColor(Color.WHITE);
        for (int i = 90; i < 240; i+=30){
            g2d.drawLine(250, i, 350, i);
        }
        g2d.setColor(Color.MAGENTA);
        g2d.fillRect(250, 360, Vertical_Width, Horizontal_Width);
        g2d.setColor(Color.WHITE);
        for (int i = 390; i < 540; i+=30){
            g2d.drawLine(250, i, 350, i);
        }
        g2d.setColor(Color.BLACK);
    }
}
