public class MainClass extends ImplementingMethods{
    static void method1(First f) {
        f.method1();
    };
    static void method2(Second s) {
        s.method4();
    };
    static void method3(Third t) {
        t.method6();
    };
    static void method4(Fourth f) {
        f.method7();
    };
    public static void main(String[] args) {
        MainClass mainClass=new MainClass();
        method1(mainClass);
        method2(mainClass);
        method3(mainClass);
        method4(mainClass);

    }
}
