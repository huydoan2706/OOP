import java.util.Random;

import static java.util.Random.*;

public class SumofTwoDice {
    public static void main(String[] args){
        Random random = new Random();
        int m = random.nextInt(6)+1;
        int n = random.nextInt(6)+1;
        System.out.println(m+n);
    }
}
