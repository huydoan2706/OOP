public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();
        boolean[][] coloured = new boolean[n*2+1][n*2+1];
        for (int i=0; i<=n*2; ++i){
            for (int j=0; j<=n*2; ++j){
                coloured[i][j] = false;
            }
        }
        int x = 0, y = 0;
        coloured[x+n][y+n] = true;
        int steps = 0;
        int temp = 0;
        while (Math.abs(x) < n && Math.abs(y) < n) {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledSquare(x, y, 0.45);
            if (coloured[x+n][y+n]){
                ++x;
                ++temp;
            }
            else{
                coloured[x+n][y+n] = true;
                if (y==temp && x>-temp) --x;
                else if (x==-temp && y>-temp) --y;
                else if (y==-temp && x<temp) ++x;
                else ++y;
            }
            steps++;
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(x, y, 0.45);
            StdDraw.show();
            StdDraw.pause(40);
        }
        StdOut.println("Total steps = " + steps);
    }

}
