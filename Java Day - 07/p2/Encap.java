package p2;
import p1.InnerEncap;
public class Encap {
    public static void main(String[] args) {
        InnerEncap obj = new InnerEncap();
        obj.setter(10);
        System.out.println(obj.getter());
    }
}
