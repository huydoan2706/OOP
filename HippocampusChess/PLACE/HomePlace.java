package HippocampusChess.PLACE;

import HippocampusChess.PLACE.StandingPlace;

import java.awt.*;

public class HomePlace extends StandingPlace {
    @Override
    public void paint(Graphics2D g2d){
        g2d.setColor(Color.BLACK);
        g2d.fillOval(30, 285, DIAMETER, DIAMETER);
        g2d.setColor(Color.RED);
        g2d.fillOval(285, 30, DIAMETER, DIAMETER);
        g2d.setColor(Color.BLUE);
        g2d.fillOval(540, 285, DIAMETER, DIAMETER);
        g2d.setColor(Color.MAGENTA);
        g2d.fillOval(285, 540, DIAMETER, DIAMETER);
        g2d.setColor(Color.BLACK);
    }
}
