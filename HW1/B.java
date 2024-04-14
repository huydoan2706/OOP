import java.util.*;


public class B {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        String studentID = scan.nextLine();
        String username = scan.nextLine();
        String email = scan.nextLine();
        System.out.println (name + '\t' + studentID + '\t' + username + '\t' + email);
        for (int i=9; i>=1; --i){
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            System.out.println("Take one down, pass it around,");
        }
        System.out.println ("No more bottles of beer on the wall.");
    }
}