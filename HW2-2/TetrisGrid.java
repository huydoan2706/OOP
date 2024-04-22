import java.util.Random;

public class TetrisGrid {
    private static boolean[][] grid;
    public static void GetGrid(){
        for (int i = grid.length-1; i>=0; --i){
            for (boolean b : grid[i]) {
                if (b) System.out.print('*');
                else System.out.print('_');
            }
            System.out.println();
        }
    }
    public static void clearRows(){
        int m = grid.length;
        int n = grid[0].length;
        for (int i=0; i<m; ++i){
            boolean check = true;
            for (boolean GRID : grid[i]){
                if (!GRID){
                    check = false;
                    break;
                }
            }
            if (check){
                for (int j = i; j < m - 1; ++j){
                    grid[j] = grid[j+1];
                }
                for (int j = 0; j < n; ++j){
                    grid[m-1][j] = false;
                }
            }
        }
    }
    public static void main (String[] args){
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        grid = new boolean[m][n];
        for (boolean[] GRID : grid) {
            for (int i=0; i<GRID.length; ++i) {
                Random random = new Random();
                int D = random.nextInt(2);
                GRID[i] = D == 1;
            }
        }
        GetGrid();
        clearRows();
    }
}
