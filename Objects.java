package InterfaecesAndAbstract;

public abstract class Objects {
    int l;
    int b;

    public Objects(int l, int b) {
        this.l = l;
        this.b = b;
    }

     abstract int area();
     abstract int perimeter();
     abstract int diagonal();
}
