package HippocampusChess.HOME;

import java.awt.*;

public class Number extends Home{
    @Override
    public void paint(Graphics2D g2d){
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        int count = 1;
        for (int i = 80; i <= 230; i += 30){
            g2d.drawString(String.valueOf(count), 295, i);
            g2d.drawString(String.valueOf(count), 295, 610 - i);
            g2d.drawString(String.valueOf(count), i -10, 305);
            g2d.drawString(String.valueOf(count), 610 - i - 10, 305);
            ++count;
        }
        g2d.setColor(Color.BLACK);
        g2d.setFont (new Font("Times New Roman", Font.BOLD, 50));
        g2d.drawString("WIN", 245, 315);
    }
}
