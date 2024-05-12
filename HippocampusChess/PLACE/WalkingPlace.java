package HippocampusChess.PLACE;

import java.awt.*;

public class WalkingPlace extends StandingPlace{
    @Override
    public void paint(Graphics2D g2d) {
        for (int i = 30; i < 240; i += 30){
            g2d.drawOval(i, 210, DIAMETER, DIAMETER);
            g2d.drawOval(570 - i, 360, DIAMETER, DIAMETER);
            g2d.drawOval(360, i, DIAMETER, DIAMETER);
            g2d.drawOval(210, 570 - i, DIAMETER, DIAMETER);
        }
        for (int i = 60; i < 240; i += 30){
            g2d.drawOval(210, i, DIAMETER, DIAMETER);
            g2d.drawOval(360, 570 - i, DIAMETER, DIAMETER);
            g2d.drawOval(i, 360, DIAMETER, DIAMETER);
            g2d.drawOval(570 - i, 210, DIAMETER, DIAMETER);
        }
    }
}
