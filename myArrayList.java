import java.util.ArrayList;

public class myArrayList extends ArrayList<Fraction>
{
    protected static final int INDEX_NOT_FOUND = -1;

    @Override
    public int indexOf(Object input) {
        if(input == null) { for(int i = 0; i < size(); i++) if(get(i) == null) return i; }
        else for(int i = 0; i < size(); i++) if(input.equals(i)) return i;
        // not found
        return INDEX_NOT_FOUND;
    }
}
