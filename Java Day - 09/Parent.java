public abstract class Parent {
    int a, b;

    Parent(int a, int b) {
        System.out.println("Parent constructor called");
        this.a = a + 2;
        this.b = b + 2;
    }

    abstract void show();
}
