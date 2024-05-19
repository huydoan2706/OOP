package HippocampusChess.PLAY;
import HippocampusChess.Pair;
import java.awt.*;
public class PlayerTwo extends Player{
    int Steps_to_the_Winner = 1;
    Pair[] homes = new Pair[4];
    int DICE;
    public PlayerTwo(){
        toa_do_2.first = Integer.MIN_VALUE;
        toa_do_2.second = Integer.MIN_VALUE;
        p2_start = false;
        p2_back_home = false;
        homes[0] = new Pair();
        homes[1] = new Pair();
        homes[2] = new Pair();
        homes[3] = new Pair();
        homes[3].first = 30; homes[3].second = 285;
        homes[0].first = 285; homes[0].second = 540;
        homes[1].first = 540; homes[1].second = 285;
        homes[2].first = 285; homes[2].second = 30;
    }
    @Override
    public void SIX(){

        if (!p2_start){
            toa_do_2.first = 30;
            toa_do_2.second = 360;
            p2_start = true;
        }
        else move();

    }
    @Override
    public void ONE(){
        if (toa_do_2.equals(homes[0])){
            if (toa_do_1.between(homes[0], homes[1])){
                move();
            }
            else if (toa_do_3.between(homes[0], homes[1])){
                move();
            }
            else if (toa_do_4.between(homes[0], homes[1])){
                move();
            }
            else{
                toa_do_2.equalise(homes[1]);
                Pair ve_chuong = new Pair();
                ve_chuong.first = Integer.MIN_VALUE;
                ve_chuong.second = Integer.MIN_VALUE;
                if (toa_do_2.equals(toa_do_1)){
                    toa_do_1.equalise(ve_chuong);
                    p1_start = false;
                    p1_back_home = false;
                }
                else if (toa_do_2.equals(toa_do_3)){
                    toa_do_3.equalise(ve_chuong);
                    p3_start = false;
                    p3_back_home = false;
                }
                else if (toa_do_2.equals(toa_do_4)){
                    toa_do_4.equalise(ve_chuong);
                    p4_start = false;
                    p4_back_home = false;
                }
            }
        }
        else if (toa_do_2.equals(homes[1])){
            if (toa_do_1.between(homes[1], homes[2])){
                move();
            }
            else if (toa_do_3.between(homes[1], homes[2])){
                move();
            }
            else if (toa_do_4.between(homes[1], homes[2])){
                move();
            }
            else{
                toa_do_2.equalise(homes[2]);
                Pair ve_chuong = new Pair();
                ve_chuong.first = Integer.MIN_VALUE;
                ve_chuong.second = Integer.MIN_VALUE;
                if (toa_do_2.equals(toa_do_1)){
                    toa_do_1.equalise(ve_chuong);
                    p1_start = false;
                    p1_back_home = false;
                }
                else if (toa_do_2.equals(toa_do_3)){
                    toa_do_3.equalise(ve_chuong);
                    p3_start = false;
                    p3_back_home = false;
                }
                else if (toa_do_2.equals(toa_do_4)){
                    toa_do_4.equalise(ve_chuong);
                    p4_start = false;
                    p4_back_home = false;
                }
            }
        }
        else if (toa_do_2.equals(homes[2])){
            if (toa_do_1.between(homes[2], homes[3])){
                move();
            }
            else if (toa_do_3.between(homes[2], homes[3])){
                move();
            }
            else if (toa_do_4.between(homes[2], homes[3])){
                move();
            }
            else{
                toa_do_2.equalise(homes[3]);
                Pair ve_chuong = new Pair();
                ve_chuong.first = Integer.MIN_VALUE;
                ve_chuong.second = Integer.MIN_VALUE;
                if (toa_do_2.equals(toa_do_1)){
                    toa_do_1.equalise(ve_chuong);
                    p1_start = false;
                    p1_back_home = false;
                }
                else if (toa_do_2.equals(toa_do_3)){
                    toa_do_3.equalise(ve_chuong);
                    p3_start = false;
                    p3_back_home = false;
                }
                else if (toa_do_2.equals(toa_do_4)){
                    toa_do_4.equalise(ve_chuong);
                    p4_start = false;
                    p4_back_home = false;
                }
                p2_back_home = true;
            }
        }
        else move();
    }

    @Override
    public void move() {
        int MOVE = DICE;
        Pair ve_chuong = new Pair();
        ve_chuong.first = Integer.MIN_VALUE;
        ve_chuong.second = Integer.MIN_VALUE;
        Pair toa_do_ban_dau = toa_do_2;
        while (MOVE > 0){
            if (p2_back_home) break;
            if ((toa_do_2.first - homes[3].first)/30 + 1 < MOVE && toa_do_2.second < 285) break;
            if (toa_do_2.equals(toa_do_1) || toa_do_2.equals(toa_do_3) || toa_do_2.equals(toa_do_4)) break;
            if (toa_do_2.first == 360 && toa_do_2.second > 30 && toa_do_2.second != 360){
                toa_do_2.second -= 30;
                --MOVE;
            }
            if (toa_do_2.first == 210 && toa_do_2.second < 540 && toa_do_2.second != 210){
                toa_do_2.second += 30;
                --MOVE;
            }
            if (toa_do_2.second == 360 && toa_do_2.first < 540 && toa_do_2.first != 210){
                toa_do_2.first += 30;
                --MOVE;
            }
            if (toa_do_2.second == 210 && toa_do_2.first > 30 && toa_do_2.first != 360){
                toa_do_2.first -= 30;
                --MOVE;
            }
            if (toa_do_2.second == 30 && toa_do_2.first > 210){
                toa_do_2.first -= 75;
                --MOVE;
            }
            if (toa_do_2.second == 540 && toa_do_2.first < 360){
                toa_do_2.first += 75;
                --MOVE;
            }
            if (toa_do_2.first == 30 && toa_do_2.second < 360){
                toa_do_2.second += 75;
                --MOVE;
            }
            if (toa_do_2.first == 540 && toa_do_2.second > 210){
                toa_do_2.second -= 75;
                --MOVE;
            }
        }
        if (MOVE > 0) toa_do_2.equalise(toa_do_ban_dau);
        else {
            if (toa_do_2.equals(toa_do_1)){
                toa_do_1.equalise(ve_chuong);
                p1_start = false;
                p1_back_home = false;
            }
            else if (toa_do_2.equals(toa_do_3)){
                toa_do_3.equalise(ve_chuong);
                p3_start = false;
                p3_back_home = false;
            }
            else if (toa_do_2.equals(toa_do_4)){
                toa_do_4.equalise(ve_chuong);
                p4_start = false;
                p4_back_home = false;
            }
            if (toa_do_2.equals(homes[3])){
                p2_back_home = true;
            }
        }
    }
    @Override
    public void turn(){
        DICE = getDice();
        if (!p2_back_home){
            while (DICE == 6 && !p2_back_home){
                SIX();
                DICE = getDice();
            }
            if (DICE == 1 && p2_start) ONE();
            else if (p2_start) move();
        }
        else{
            while (DICE == 6){
                Road_to_Champion();
                DICE = getDice();
            }
            Road_to_Champion();
        }
    }
    @Override
    public void Road_to_Champion() {
        if (DICE == Steps_to_the_Winner){
            toa_do_2.first += 30;
            ++ Steps_to_the_Winner;
        }
        if (Steps_to_the_Winner == 7) {
            WIN = 2;
            GameOver();
        }
    }
    @Override
    public void paint (Graphics2D g2d){
        g2d.setColor(Color.BLACK);
        g2d.fillRect(toa_do_2.first, toa_do_2.second, 30, 30);
    }
}
