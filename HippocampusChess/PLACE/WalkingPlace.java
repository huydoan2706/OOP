package HippocampusChess.PLACE;

import java.awt.*;

public class WalkingPlace extends StandingPlace{
    @Override
    public void paint(Graphics2D g2d) {
        for (int i = 24; i < 240; i += 36){
            g2d.drawOval(i, 204, DIAMETER, DIAMETER);
            g2d.drawOval(570 - i, 366, DIAMETER, DIAMETER);
            g2d.drawOval(366, i, DIAMETER, DIAMETER);
            g2d.drawOval(204, 570 - i, DIAMETER, DIAMETER);
        }
        for (int i = 60; i < 240; i += 36){
            g2d.drawOval(204, i, DIAMETER, DIAMETER);
            g2d.drawOval(366, 570 - i, DIAMETER, DIAMETER);
            g2d.drawOval(i, 366, DIAMETER, DIAMETER);
            g2d.drawOval(570 - i, 204, DIAMETER, DIAMETER);
        }
    }
}
