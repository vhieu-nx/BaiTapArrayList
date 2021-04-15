import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + size );
        }
        return (E) elements[i];
    }
    public E remove(int index){
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size );
        }
        else {
            Object element = elements[index];
            Object [] newElements = new Object[size-1];
            if (index!=0) {
                for (int i = 0; i < newElements.length ; i++) {
                    if(i<index){
                        newElements[i]=elements[i];
                    }
                    else if (i>index){
                        newElements[i]=elements[i+1];
                    }
                }
            }
            else if(index==0){
                for (int i = 0; i <newElements.length ; i++) {
                    newElements[i]=elements[i+1];
                }
            }
            else if(index==size-1){
                for (int i = 0; i <newElements.length ; i++) {
                    newElements[i]=elements[i];
                }
            }
            this.elements=newElements;
            this.size--;
            return (E)element;
        }
    }
    public MyList<E> clone(){
        MyList<E> newElements = new MyList<E>();
        for (int i = 0; i < size; i++) {
            newElements.add((E)elements[i]);
        }
        return newElements;
    }
    public boolean contains(E o){
        for (int i = 0; i < size; i++) {
            if (elements[i]== o){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if(o==elements[i]){
                return i;
            }
        }
        return -1;
    }
    public int size(){
        return size;
    }
    public void clear(){
        Object[] newObject = new Object[0];
        elements=newObject;
        size=0;
    }
    private void ensureCapacity(int increase ) {
        int newSize = elements.length + increase;
        elements = Arrays.copyOf(elements, newSize);
    }
    @Override
    public String toString() {
        String result ="";
        for (int i = 0; i < size-1; i++) {
            result+=elements[i]+", ";
//            if(i==size-1){
//            }
        }
        result+=elements[size-1];
        return "["+result+"]";
    }
}
