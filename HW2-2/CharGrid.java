import java.util.Random;

public class CharGrid {
    private static char[][] list_of_char;
    public static int charArea (char ch){
        int a = list_of_char.length;
        int b = list_of_char[0].length;
        int x_min = Integer.MAX_VALUE;
        int y_min = Integer.MAX_VALUE;
        int x_max = Integer.MIN_VALUE;
        int y_max = Integer.MIN_VALUE;
        for (int i=0; i<a; ++i){
            for (int j=0; j<b; ++j){
                if (list_of_char[i][j] == ch){
                    if (i < x_min) x_min = i;
                    if (i > x_max) x_max = i;
                    if (j < y_min) y_min = j;
                    if (j > y_max) y_max = j;
                }
            }
        }
        return (x_max - x_min) * (y_max - y_min);
    }

    public static void main (String[] args){
        Random random = new Random();
        char ch = (char)(random.nextInt(26) + 'a');
        int a = args.length;
        int b = args[0].length();
        list_of_char = new char[a][b];
        for (int i=0; i<a; ++i){
            String str = args[i];
            for (int j=0; j<b; ++j){
                list_of_char[i][j] = str.charAt(j);
            }
        }
        System.out.println ("The char area of char " + ch + " is: " + charArea(ch));
    }
}
