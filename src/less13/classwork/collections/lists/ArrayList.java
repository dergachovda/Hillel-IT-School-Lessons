package less13.classwork.collections.lists;

import java.util.Iterator;

public class ArrayList implements List {

    private static final int INITIAL_CAPACITY = 10;

    private String[] array;

    private int size;

    ArrayList() {
        this(INITIAL_CAPACITY);
        //array = new String[INITIAL_CAPACITY];
    }

    ArrayList(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmply() {
        return size == 0;
    }

    public boolean contains(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element))
                return true;
        }
        return false;
    }

    public void add(String element) {
        resize();
        array[size] = element;
        size++;
    }

    private void resize() {
        //увеличиваем
        if (size == array.length) {
            newArray(size << 1);
        }

        //уменьшаем
        if (size < array.length / 4) {
            newArray(array.length >> 1);
        }
    }

    private void newArray(int size) {
        String[] arrayNew = new String[size];
        System.arraycopy(array, 0, arrayNew, 0, this.size);
        array = arrayNew;
    }

    public String set(int index, String element) {
        String oldElement = array[index];
        array[index] = element;
        return oldElement;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
        resize();
    }

    public void remove(String element) {

    }

    public void clear() {

    }

    public int indexOf(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element))
                return i;
        }
        return -1;
    }

    public String get(int index) {
        return array[index];
    }

    public String toString() {
        String out = "[ ";
        for (int i = 0; i < size; i++) {
            out += array[i];
            if (i != size - 1)
                out += ", ";
        }
        out += " ]";
        return out;
    }

    public Iterator listIterator() {
        return new ListIterator();
    }

    public BackwardListIterator backwardListIterator() {
        return new BackwardListIterator(array, size);
    }

    private class ListIterator implements Iterator {

        private int current = 0;

        public boolean hasNext() {
            return current < size;
        }

        public Object next() {
            String element = array[current];
            current++;
            return element;
        }
    }

    private class RandomIterator implements Iterator {

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            return null;
        }
    }

}
