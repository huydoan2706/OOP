package HippocampusChess.PLACE;

import HippocampusChess.PLACE.StandingPlace;

import java.awt.*;

public class HomePlace extends StandingPlace {
    @Override
    public void paint(Graphics2D g2d){
        g2d.setColor(Color.BLACK);
        g2d.fillOval(24, 285, DIAMETER, DIAMETER);
        g2d.setColor(Color.RED);
        g2d.fillOval(285, 24, DIAMETER, DIAMETER);
        g2d.setColor(Color.BLUE);
        g2d.fillOval(546, 285, DIAMETER, DIAMETER);
        g2d.setColor(Color.MAGENTA);
        g2d.fillOval(285, 546, DIAMETER, DIAMETER);
        g2d.setColor(Color.BLACK);
    }
}
