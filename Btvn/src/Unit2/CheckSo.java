package Unit2;

public class CheckSo implements A {
    public void method1(){
        System.out.println("abc");
    }
    public void method2(){
        System.out.println("cde");
    }
    public void method3(){
        System.out.println("def");
    }

    public static void main(String[] args) {
        CheckSo obj1 = new CheckSo();
        A obj2 = new CheckSo();
        ((CheckSo) obj2).method3();
    }
}


interface A{
    void method1();
    void method2();
}