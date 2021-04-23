import java.lang.reflect.Array;

public class demo {
    public static void main(String[] args) {
    double a =10;
    method1(a);
    }
    static void method1(int a){
        System.out.println(a);
    }

    static void method1(float a){
        System.out.println(a);
    }

    static void method1(double d){
        System.out.println(d);
    }
}
