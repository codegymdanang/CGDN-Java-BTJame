package B6_CauTrucDuLieuVaGaiThuatCoBan.TrienKhaiCacPhuongThucCuaLinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = new Node(-1);
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", numNodes: " + numNodes);
        }
        if (index == numNodes) {
            addLast(element);
        } else {
            addFirst(element);
        }

    }
    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E e) {
        Node temp = head;
        Node holder;

        for(int i=0; i < numNodes-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Node holder;
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", numNodes: " + numNodes);
        }
        for(int i=0; i < index-1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = null;
        temp.next = holder.next;
        numNodes--;
        return (E)holder.data;
    }

    public boolean remove(Object object) {
        return false;
    }
    public int size() {
        return 0;
    }
    public E clone() {
        return null;
    }

    public boolean contains(E o) {
        return false;
    }

    public int indexOf(E o) {
        return -1;
    }

    public boolean add(E e) {
        return true;
    }

    public void ensureCapacity(int minCapacity) {

    }
    public E get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return (E)temp.data;
    }

    public E getFirst() {
        return null;
    }
    public E getLast() {
        return null;
    }
    public void clear() {

    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
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
