class CSE {
    int a, b;
    void show(CSE obj) {
        obj.a = a / 2;
        obj.b = b / 2;
    }
}

class Test {
    public static void main(String[] args) {
        CSE obj = new CSE();
        obj.a = 100;
        obj.b = 400;
        System.out.println("Before Change : a = " + obj.a + "," + " b = " + obj.b);
        obj.show(obj);
        System.out.println("After Change : a = " + obj.a + "," + " b = " + obj.b);

        CSE obj2 = obj;
        obj2.show(obj2);
        System.out.println("After 2nd Change : a = " + obj2.a + "," + " b = " + obj2.b);
    }
}