package HippocampusChess;

import HippocampusChess.HOME.HorizontalHome;
import HippocampusChess.HOME.Number;
import HippocampusChess.HOME.VerticalHome;
import HippocampusChess.PLACE.HomePlace;
import HippocampusChess.PLACE.StartingPlace;
import HippocampusChess.PLACE.WalkingPlace;
import HippocampusChess.PLAY.PlayerFour;
import HippocampusChess.PLAY.PlayerOne;
import HippocampusChess.PLAY.PlayerThree;
import HippocampusChess.PLAY.PlayerTwo;

import javax.swing.*;
import java.awt.*;

public class Gameplay extends JPanel {
    HomePlace homePlace = new HomePlace();
    WalkingPlace walkingPlace = new WalkingPlace();
    StartingPlace startingPlace = new StartingPlace();
    VerticalHome verticalHome = new VerticalHome();
    HorizontalHome horizontalHome = new HorizontalHome();
    Number number = new Number();
    PlayerOne playerOne = new PlayerOne();
    PlayerTwo playerTwo = new PlayerTwo();
    PlayerThree playerThree = new PlayerThree();
    PlayerFour playerFour = new PlayerFour();

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        homePlace.paint(g2d);
        walkingPlace.paint(g2d);
        startingPlace.paint(g2d);
        verticalHome.paint(g2d);
        horizontalHome.paint(g2d);
        number.paint(g2d);
        playerOne.paint(g2d);
        playerTwo.paint(g2d);
        playerThree.paint(g2d);
        playerFour.paint(g2d);
    }
    public void turn(){
        System.out.println ("P1 turn");
        playerOne.turn();
        System.out.println ("P2 turn");
        playerTwo.turn();
        System.out.println ("P3 turn");
        playerThree.turn();
        System.out.println ("P4 turn");
        playerFour.turn();
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Cờ cá ngựa");
        Gameplay gameplay = new Gameplay();
        frame.add(gameplay);
        frame.setSize(600, 630);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        while (true){
            gameplay.turn();
            gameplay.repaint();
            Thread.sleep(3000);
        }
    }
}
