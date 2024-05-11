package HippocampusChess.PLACE;

import java.awt.*;

public class StartingPlace extends StandingPlace{
    @Override
    public void paint(Graphics2D g2d) {
        int i = 24;
        g2d.setColor(Color.RED);
        g2d.fillOval(204, i, DIAMETER, DIAMETER);
        g2d.setColor(Color.MAGENTA);
        g2d.fillOval(366, 570 - i, DIAMETER, DIAMETER);
        g2d.setColor(Color.BLACK);
        g2d.fillOval(i, 366, DIAMETER, DIAMETER);
        g2d.setColor(Color.BLUE);
        g2d.fillOval(570 - i, 204, DIAMETER, DIAMETER);
        g2d.setColor(Color.BLACK);
    }
}
