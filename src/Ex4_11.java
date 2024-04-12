public class Ex4_11 {
    public static void main(String[] args) {
        Calc a = new Calc();
        int foo = a.n;
        System.out.println(foo);
        int bar = Calc.m;
        System.out.println(bar);

        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));
    }
}

class Calc {
    int n = 100;
    static int m = 200;
    public static int abs(int a) { return a>0?a:-a; }
    public static int max(int a, int b) { return (a>b)?a:b; }
    public static int min(int a, int b) { return (a>b)?b:a; }
}