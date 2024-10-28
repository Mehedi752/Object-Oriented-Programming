class first {
    int num = 5;

    void display() {
        System.out.println("Value of num : " + num);
    }
}

public class test {
    public static void main(String[] args) {
        first obj = new first();
        obj.num = 10;
        obj.display();
    }
}
