package HippocampusChess.PLAY;

import HippocampusChess.Pair;

import java.awt.*;

public class PlayerOne extends Player{
    int Steps_to_the_Winner = 1;
    Pair[] homes = new Pair[4];
    public PlayerOne(){
        toa_do_1.first = Integer.MIN_VALUE;
        toa_do_1.second = Integer.MIN_VALUE;
        p1_start = false;
        p1_back_home = false;
        homes[0].first = 24; homes[0].second = 285;
        homes[1].first = 285; homes[1].second = 546;
        homes[2].first = 546; homes[2].second = 285;
        homes[3].first = 285; homes[3].second = 24;
    }
    @Override
    public void SIX(){
        if (!p1_start){
            toa_do_1.first = 204;
            toa_do_1.second = 24;
            p1_start = true;
        }
        else move();

    }
    @Override
    public void ONE(){
        Pair ve_chuong = new Pair();
        ve_chuong.first = Integer.MIN_VALUE;
        ve_chuong.second = Integer.MIN_VALUE;
        int i = 0;
        while (i < 3){
            if (toa_do_1.equals(homes[i])){
                if (toa_do_2.between(homes[i], homes[i+1])){
                    move();
                    break;
                }
                else if (toa_do_3.between(homes[i], homes[i+1])){
                    move();
                    break;
                }
                else if (toa_do_4.between(homes[i], homes[i+1])){
                    move();
                    break;
                }
                else{
                    toa_do_1.equalise(homes[i+1]);
                    if (toa_do_1.equals(toa_do_2)){
                        toa_do_2.equalise(ve_chuong);
                        p2_start = false;
                        p2_back_home = false;
                    }
                    else if (toa_do_1.equals(toa_do_3)){
                        toa_do_3.equalise(ve_chuong);
                        p3_start = false;
                        p3_back_home = false;
                    }
                    else if (toa_do_1.equals(toa_do_4)){
                        toa_do_4.equalise(ve_chuong);
                        p4_start = false;
                        p4_back_home = false;
                    }
                    else if (toa_do_1.equals(homes[3])){
                        p1_back_home = true;
                    }
                }
            }
            else ++i;
        }

        if (i==3) move();
    }

    @Override
    public void move() {
        int MOVE = getDice();
        Pair ve_chuong = new Pair();
        ve_chuong.first = Integer.MIN_VALUE;
        ve_chuong.second = Integer.MIN_VALUE;
        Pair toa_do_ban_dau = toa_do_1;
        while (MOVE > 0){
            if (Math.abs(toa_do_1.second - homes[3].second)/36 + 1 < MOVE) break;
            if (toa_do_1.equals(toa_do_2) || toa_do_1.equals(toa_do_3) || toa_do_1.equals(toa_do_4)) break;
            if (toa_do_1.first == 366 && toa_do_1.second > 24 && toa_do_1.second != 366){
                toa_do_1.second -= 36;
                --MOVE;
            }
            if (toa_do_1.first == 204 && toa_do_1.second < 546 && toa_do_1.second != 366){
                toa_do_1.second += 36;
                --MOVE;
            }
            if (toa_do_1.second == 366 && toa_do_1.first < 546 && toa_do_1.first != 204){
                toa_do_1.first += 36;
                --MOVE;
            }
            if (toa_do_1.second == 204 && toa_do_1.first > 24 && toa_do_1.first != 366){
                toa_do_1.first -= 36;
                --MOVE;
            }
            if (toa_do_1.second == 24 && toa_do_1.first > 204){
                toa_do_1.first -= 81;
                --MOVE;
            }
            if (toa_do_1.second == 546 && toa_do_1.first < 366){
                toa_do_1.first += 81;
                --MOVE;
            }
            if (toa_do_1.first == 24 && toa_do_1.second < 366){
                toa_do_1.second += 81;
                --MOVE;
            }
            if (toa_do_1.first == 546 && toa_do_1.second > 204){
                toa_do_1.second -= 81;
                --MOVE;
            }
        }
        if (MOVE > 0) toa_do_1.equalise(toa_do_ban_dau);
        else if (toa_do_1.equals(toa_do_2)){
            toa_do_2.equalise(ve_chuong);
            p2_start = false;
            p2_back_home = false;
        }
        else if (toa_do_1.equals(toa_do_3)){
            toa_do_3.equalise(ve_chuong);
            p3_start = false;
            p3_back_home = false;
        }
        else if (toa_do_1.equals(toa_do_4)){
            toa_do_4.equalise(ve_chuong);
            p4_start = false;
            p4_back_home = false;
        }
        else if (toa_do_1.equals(homes[3])){
            p1_back_home = true;
        }
    }
    @Override
    public void turn(){
        if (!p1_back_home){
            while (getDice() == 6){
                SIX();
                getDice();
            }
            if (getDice() == 1) ONE();
            else if (p1_start) move();
        }
        else Road_to_Champion();
    }
    @Override
    public void Road_to_Champion() {
        if (getDice() == Steps_to_the_Winner){
            toa_do_1.second += 40;
            ++ Steps_to_the_Winner;
        }
        if (Steps_to_the_Winner == 6) {
            WIN = 1;
            GameOver();
        }
    }
    @Override
    public void paint (Graphics2D g2d){
        g2d.setColor(Color.RED);
        g2d.drawRect(toa_do_1.first, toa_do_1.second, 30, 30);
        g2d.setColor(Color.BLACK);
    }
}
