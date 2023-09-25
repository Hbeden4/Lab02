import java.util.ArrayList;

public class myArrayList extends ArrayList<Fraction>
{
    public myArrayList() { ensureCapacity(50); }

    public int indexOf(Fraction input) {
        return super.indexOf(input);
    }
}
