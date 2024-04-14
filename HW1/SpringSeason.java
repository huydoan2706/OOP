import java.util.Scanner;

public class SpringSeason {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int d = scan.nextInt();
        if (m>3 && m<6){
            System.out.println("true");
        }
        else if (m==3 && d>=20){
            System.out.println("true");
        }
        else if (m==6 && d<=20){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
