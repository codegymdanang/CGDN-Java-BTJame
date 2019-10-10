package B6_CauTrucDuLieuVaGaiThuatCoBan.TrienKhaiCacPhuongThucCuaArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E e) {
        if (index >= elements.length) {
            ensureCapacity(index-elements.length);
        }
        elements[index] = e;
        size++;
    }

    public E remove(int index) {
        E objRemoved = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, elements.length - 1);
        return objRemoved;
    }

    public int size() {
        return size;
    }
    public E clone() {
        try {
            return (E)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o) || elements[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, elements.length + minCapacity);

    }

    public E get(int i) {
        if (i < 0 || i >= elements.length) {
            throw new IndexOutOfBoundsException("Index " + i + " size" + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;

    }
}
