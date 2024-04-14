import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Distance {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        double n = sqrt(x*x + y*y);
        System.out.println (n);
    }
}
