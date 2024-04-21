public class Vector {
    private int n;
    private double[] data;
    public Vector(int n){
        this.n = n;
        this.data = new double[n];
    }
    public Vector(double[] data){
        n = data.length;
        this.data = new double[n];
        for (int i=0; i<n; ++i){
            this.data[i] = data[i];
        }
    }
    public Vector sort(){
        for (int i=0; i<this.n; ++i){
            for (int j=i+1; j<this.n; ++j){
                if (this.data[i] > this.data[j]){
                    double M = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = M;
                }
            }
        }
        return this;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append('(');
        for (int i=0; i<n; ++i){
            s.append(data[i]);
            if (i<n-1) s.append(" , ");
        }
        s.append(')');
        return s.toString();
    }
    public static void main (String[] args){
        int N = Integer.parseInt(args[0]);
        double[] DATA = new double[N];
        for (int i=0; i<N; ++i){
            DATA[i] = Double.parseDouble(args[i+1]);
        }
        Vector vector = new Vector(DATA);
        System.out.println(vector.sort().toString());
    }
}
