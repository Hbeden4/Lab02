
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
    
    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the lowest index {@code i} such that
     * {@code Objects.equals(o, get(i))},
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this list
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     * 
     * @since 18 September 2023
     * @author Julian Edwards
     */
    public int indexOf(Fraction o) {
        return super.indexOf(o); // I realized the code I had here was the same as java's so I'm just calling super here, I hope that's ok
    }
}

