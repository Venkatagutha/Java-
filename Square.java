package InterfaecesAndAbstract;

public class Square extends Objects {
    public Square(int l, int b) {
        super(l, b);
    }
    public int area(){
        return l*l;
    }
    public int perimeter(){
        return 4*l;
    }
    public int diagonal(){
        return l;
    }
}
