package HippocampusChess.PLAY;

import HippocampusChess.Pair;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract public class Player extends JPanel {
    Pair toa_do_1 = new Pair();
    Pair toa_do_2 = new Pair();
    Pair toa_do_3 = new Pair();
    Pair toa_do_4 = new Pair();
    boolean p1_start;
    boolean p2_start;
    boolean p3_start;
    boolean p4_start;
    boolean p1_back_home;
    boolean p2_back_home;
    boolean p3_back_home;
    boolean p4_back_home;
    int WIN;
    public int getDice(){
        Random r = new Random();
        int m = r.nextInt(6) + 1;
        System.out.println ("You got a " + m + "!");
        return m;
    }
    abstract public void paint(Graphics2D g2d);


    abstract public void SIX();
    abstract public void ONE();
    abstract public void move();
    abstract public void turn();
    abstract public void Road_to_Champion();
    public void GameOver(){
        int n = JOptionPane.showConfirmDialog(
                this,
                "Player " + WIN + " wins!!!\n",
                "Game over",
                JOptionPane.DEFAULT_OPTION
        );
        System.exit(ABORT);
    }
}
