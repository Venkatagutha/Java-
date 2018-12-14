package InterfaecesAndAbstract;

public class Main {
    public static void main(String[] args) {

        Rectangle obj = new Rectangle(2,4);
        Square obj1 = new Square(6,3);

        System.out.println(obj.area());
        System.out.println(obj1.perimeter());
    }

}
