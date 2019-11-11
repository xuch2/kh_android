package day21.Anonymous;

class A {
    private int num;

    public A() {
        num = 3;
        System.out.println("A called");
    }
    public int getNum() {
        return num;
    }
    public interface Test {
        public void test();
    }
}

class B {
    private int dst;

    public B() {
        System.out.println("B called = " + dst);
    }

    public void callInteface(Go l) {
        System.out.println("callInterface Called");
    }
    public interface Go {
        void go();
    }
}

public class AnonyTest {
    public static void main(String[] args) {
        A a = new A();

        new A.Test() {
            public void test() {
                System.out.println("Test");
            }
        };

        B b = new B();
        b.callInteface(new B.Go() {
            public void go() {
                System.out.println("interface go");
            }
        });
    }
}
