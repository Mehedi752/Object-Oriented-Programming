class parent{
    parent(int a, int b){
        System.out.println("Parent class constructor : "+(a+b));
    } 

    void show(){
        System.out.println("Parent class show method");
    }
}

class child extends parent{
    child(int a, int b){
        super(a, b);
        System.out.println("Child class constructor : "+(a+b));
        super.show();
    } 
}

public class OverRiding2 {
    public static void main(String[] args) {
        // parent ob = new parent(30, 40);
        child myOb = new child(10, 20);
    }
}
