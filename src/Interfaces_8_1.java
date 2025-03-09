interface A {
    final int a = 10;
    void methodA();
}
interface A1 extends A{
    final int a1 = 20;
    void methodA1();
}
interface A2 extends A{
    final int a2 = 30;
    void methodA2();
}
interface A12 extends A1,A2{
    final int a12 = 40;
    void methodA12();
}

class B implements A12{
    public void methodA() {
        System.out.println("this is interface A " + a);
    }
    public void methodA1() {
        System.out.println("this is interface A1 " + a1);
    }
    public void methodA2() {
        System.out.println("this is interface A2 " + a2);
    }
    public void methodA12() {
        System.out.println("this is interface A12 " + a12);
    }
}

public class Interfaces_8_1 {
    public static void main(String[] args){
        B obj = new B();
        obj.methodA();
        obj.methodA1();
        obj.methodA2();
        obj.methodA12();
    }
}
