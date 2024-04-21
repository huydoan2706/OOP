import java.awt.*;

public class FlipX {
    public static void main (String[] args){
        Picture p = new Picture(args[0]);
        int width = p.width();
        int height = p.height();
        p.show();
        for (int i=0; i<height; ++i){
            for (int j=0; j<width/2; ++j){
                Color c1 = p.get(j, i);
                Color c2 = p.get(width - j - 1, i);
                p.set(j, i, c2);
                p.set(width - 1 - j, i, c1);
            }
        }
        p.show();
    }
}
