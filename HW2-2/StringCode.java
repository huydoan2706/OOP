public class StringCode {
    public static int maxRun (String str){
        int n = str.length();
        int max = 0;
        int count = 1;
        for (int i=1; i<n; ++i){
            if (str.charAt(i) == str.charAt(i-1)) ++ count;
            else {
                if (count > max) max = count;
                count = 1;
            }
        }
        return max;
    }

    public static String blowup (String str){
        StringBuilder s = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; ++i){
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                int M = str.charAt(i) - '0';
                for (int index = 0; index < M; ++index) s.append(str.charAt(i+1));
            }
            else s.append(str.charAt(i));
        }
        return s.toString();
    }
    public static boolean LCS (String a, String b, int len){
        int m = a.length();
        int n = b.length();
        int[][] C = new int[m+1][n+1];
        for (int i=0; i<=m; ++i) C[i][0] = 0;
        for (int i=0; i<=n; ++i) C[0][i] = 0;
        for (int i=1; i<=m; ++i){
            for (int j=1; j<=n; ++j){
                if (a.charAt(i-1) == b.charAt(j-1)) C[i][j] = C[i-1][j-1] + 1;
                else{
                    C[i][j] = Math.max(C[i - 1][j], C[i][j - 1]);
                }
            }
        }
        return C[m][n] == len;
    }
    public static void main(String[] args) {
        System.out.println ("The longest MaxRun of args[0]: " + maxRun(args[0]));
        System.out.println("The 'blowup' string of args[1]: " + blowup(args[1]));
        int len = Integer.parseInt(args[2]);
        if (LCS(args[3], args[4], len))
            System.out.println ("The length of the LCS of args[3] and args[4] is " + len);
        else System.out.println ("The length of the LCS of args[3] and args[4] isn't " + len);
    }
}