import java.awt.Color;

public class ColorSeparation {
    public static void main (String[] args){
        Picture p = new Picture(args[0]);
        int width = p.width();
        int height = p.height();
        Picture picR = new Picture(width, height);
        Picture picG = new Picture(width, height);
        Picture picB = new Picture(width, height);
        for (int row = 0; row < height; ++row){
            for (int col = 0; col < width; ++col){
                Color color = p.get(col, row);
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                picR.set(col, row, new Color(red, 0, 0));
                picG.set(col, row, new Color(0, green, 0));
                picB.set(col, row, new Color(0, 0, blue));
            }
        }
        picR.show();
        picG.show();
        picB.show();
    }
}
