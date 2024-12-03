public class Child extends Parent {
    Child(int a, int b) {
        super(a, b);
        System.out.println("Child constructor called");
    }

    void show() {
        System.out.println("a = " + a + " b = " + b);
    }
}
