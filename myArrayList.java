
import java.util.ArrayList;
//Code By Silas
public class myArrayList extends ArrayList<Fraction> {

    private static final int INITIAL_CAPACITY = 50;
    private int capacity;

    public myArrayList() {
        super(INITIAL_CAPACITY); // Initialize with the initial capacity of 50
        this.capacity = INITIAL_CAPACITY;
    }


    public void add(int index, Fraction input) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        ensureCapacity(size() + 1);
        super.add(index, input);
    }
}

import java.util.ArrayList;

public class myArrayList extends ArrayList<Fraction>
{
    public myArrayList() { ensureCapacity(50); }

    public int indexOf(Fraction input) {
        return super.indexOf(input);
    }
}

