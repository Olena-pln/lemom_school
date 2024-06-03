public class TypeConversions {
    public static void main(String[] args) {
        System.out.println("Implicit type conversions.");
        System.out.println("Byte --> Short");
        byte a = 127;
        short b = a;
        System.out.println(b);
        System.out.println("Short --> Int");
        short c = 32_767;
        int d = c;
        System.out.println(d);
        System.out.println("Int --> Long");
        int e = 2_147_483_647;
        long f = e;
        System.out.println(f);
        System.out.println("Int  --> Double");
        int g = 2_147_483_647;
        double h = g;
        System.out.println(h);
        System.out.println("Float  --> Double");
        float i = 0.5f;
        double j = i;
        System.out.println(j);
        System.out.println("Char  --> Int");
        char k = '@';
        int l = k;
        System.out.println(l);

        System.out.println("Explicit type conversions.");
        System.out.println("Long --> Int");
        long m = 123_456_789_012_321_765L;
        int n = (int)m;
        System.out.println(n);
        System.out.println("Int--> Short");
        int o = 32_766;
        short p = (short)o;
        System.out.println(p);
        System.out.println("Int--> char");
        int q = '2';
        char r = (char)q;
        System.out.println(r);
        System.out.println("Short --> Byte");
        short s = 126;
        byte t = (byte)s;
        System.out.println(t);
        System.out.println("Double--> Float");
        double u = 0.5f;
        float v = (float)u;
        System.out.println(v);
        System.out.println("Double--> Int");
        double w = 1.9;
        int x = (int)w;
        System.out.println(x);

    }
}