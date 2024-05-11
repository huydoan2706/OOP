package HippocampusChess.HOME;

import java.awt.*;

public class HorizontalHome extends Home {
    @Override
    public void paint(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.fillRect(60, 240, Horizontal_Width, Vertical_Width);
        g2d.setColor(Color.WHITE);
        for (int i=90; i<240; i+=30){
            g2d.drawLine(i, 240, i, 360);
        }
        g2d.setColor(Color.BLUE);
        g2d.fillRect(360, 240, Horizontal_Width, Vertical_Width);
        g2d.setColor(Color.WHITE);
        for (int i=390; i<540; i+=30){
            g2d.drawLine(i, 240, i, 360);
        }
        g2d.setColor(Color.BLACK);
    }
}
