public class ReverseString{
    public static String reverse(String s){
        int n = s.length();
        StringBuilder s1 = new StringBuilder();
        for (int i=n-1; i>=0; --i){
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }
    public static void main (String[] args){
        System.out.println (reverse(args[0]));
    }
}