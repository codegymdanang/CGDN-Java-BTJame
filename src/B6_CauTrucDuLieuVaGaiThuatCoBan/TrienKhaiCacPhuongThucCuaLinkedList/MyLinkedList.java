package B6_CauTrucDuLieuVaGaiThuatCoBan.TrienKhaiCacPhuongThucCuaLinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = new Node(0);
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E data) {

    }

    public E remove(int index) {
        return null;
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
