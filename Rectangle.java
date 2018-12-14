package InterfaecesAndAbstract;

public class Rectangle extends Objects {

    public Rectangle(int l, int b) {

        super(l, b);
    }

    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
    public int diagonal(){
        return (l*l)-(b*b);
    }
}
