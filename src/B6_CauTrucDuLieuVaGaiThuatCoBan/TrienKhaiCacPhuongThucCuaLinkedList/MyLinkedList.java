package B6_CauTrucDuLieuVaGaiThuatCoBan.TrienKhaiCacPhuongThucCuaLinkedList;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Cloneable {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", numNodes: " + numNodes);
        }
        if (index == 0 || head == null) {
            addLast(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index -2; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(element);
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }

    }

    public void addFirst(E e) {
        Node temp = new Node(e);
        temp.next = head;
        head = temp;
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null) {
            head = new Node(e);
        } else {
            Node temp = head;
            for (int i = 0; i < numNodes - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(e);
            numNodes++;
        }
    }

    public E remove(int index) {
        Node temp = head;
        Node holder;
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", numNodes: " + numNodes);
        }
        for (int i = 0; i < index - 2; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return (E) holder.data;
    }

    public boolean remove(Object object) {
        Node temp = head;
        Node holder = head;
        for (int i = 0; i < numNodes; i++) {
            if (object.equals(temp.data)) {
                holder.next = temp.next;
                numNodes--;
                return true;
            }
            holder = temp;
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    // Sua lai return MyLinkedList<E> thay vi E
    public MyLinkedList<E> clone() {
        try {
            MyLinkedList<E> list = (MyLinkedList<E>) super.clone();//khong can implements Cloneable ,cai dat kieu khac
            return list;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (o.equals(temp.data)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

//    public void ensureCapacity(int minCapacity) { xoa method nay
//
//    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        if (head == null)
            throw new NoSuchElementException();
        return (E) head.data;
    }

    public E getLast() {
        if (head == null)
            throw new NoSuchElementException();
        Node temp = head;
        for (int i = 0; i < numNodes-1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = null;
        numNodes =0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
}
