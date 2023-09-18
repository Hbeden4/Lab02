import java.util.ArrayList;

public class myArrayList extends ArrayList<Fraction>
{
    protected static final int INDEX_NOT_FOUND = -1;
    public myArrayList() { ensureCapacity(50); }

    public int indexOf(Fraction input) {
        return super.indexOf(input);
    }
}
