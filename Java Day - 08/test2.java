
class CSE {
    int a;

    CSE(int i) {
        a = i;
    }

    CSE add() {
        CSE temp = new CSE(a + 10);
        return temp;
    }
}

public class test2 {
    public static void main(String[] args) {

        CSE obj = new CSE(2);
        System.out.println("obj.a: " + obj.a);

        CSE ob2 = obj.add();
        System.out.println("ob2.a: " + ob2.a);
    }
}
