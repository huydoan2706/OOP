import java.lang.*;
import java.util.Scanner;

public class Rational {
    private int tu;
    private int mau;
    public int UCLN (int m, int n){
        while (m!=0 && n!=0){
            if (m>n) m%=n;
            else n%=m;
        }
        if (m!=0) return m;
        else return n;
    }

    public Rational (int tuso, int mauso){
        if (mauso==0){
            throw new RuntimeException("Phan so khong ton tai");
        }
        else {
            tu = tuso/UCLN(tuso, mauso);
            mau = mauso/UCLN(tuso, mauso);
        }
    }


    public String toString() {
        if (mau==1) return String.valueOf(tu);
        return tu + " / " + mau;
    }


    public Rational plus (Rational b){
        int TU = this.tu * b.mau + this.mau * b.tu;
        int MAU = this.mau * b.mau;
        return new Rational (TU, MAU);
    }

    public Rational minus (Rational b){
        int TU = this.tu * b.mau - this.mau * b.tu;
        int MAU = this.mau * b.mau;
        return new Rational (TU, MAU);
    }

    public Rational multiply (Rational b){
        int TU = this.tu * b.tu;
        int MAU = this.mau * b.mau;
        return new Rational (TU, MAU);
    }

    public Rational divide (Rational b){
        int TU = this.tu * b.mau;
        int MAU = this.mau * b.tu;
        return new Rational (TU, MAU);
    }

    public static void main (String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int a = Integer.parseInt(args[2]);
        int b = Integer.parseInt(args[3]);
        Rational r1 = new Rational(x, y);
        Rational r2 = new Rational(a, b);
        System.out.println (r1.plus(r2));
        System.out.println (r1.minus(r2));
        System.out.println (r1.multiply(r2));
        System.out.println (r2.divide(r1));
    }
}
