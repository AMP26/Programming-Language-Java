package OwnImmutableClass;
public final class Imut {
    private int i;

    Imut(int i) {
        this.i = i;
    }

    public Imut modify(int a) {
        if(this.i == a)
            return this;
        else
            return new Imut(a);
    }
}
