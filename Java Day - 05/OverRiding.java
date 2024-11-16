class parent {
    int a,b;
    parent(){
        System.out.println("Parent class constructor");
    }

    void add(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Parent Sum: "+(a+b));
    }
}

class child extends parent {
    
    child(){
        System.out.println("Child class constructor");
    }

    void add(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Child Sum: "+(a+b));
    }
}

public class OverRiding {
    public static void main(String[] args) {
        parent ob = new parent();
        ob.add(30, 40);
        
        child myOb = new child();
        myOb.add(10, 20);
    }
}
