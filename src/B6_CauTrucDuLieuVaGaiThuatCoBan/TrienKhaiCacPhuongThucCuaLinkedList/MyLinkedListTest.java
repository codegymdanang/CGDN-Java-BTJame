package B6_CauTrucDuLieuVaGaiThuatCoBan.TrienKhaiCacPhuongThucCuaLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING MyLinkedList<Integer> /=/=/=/=");
        MyLinkedList<Integer> llInteger = new MyLinkedList<Integer>();
        llInteger.addFirst(11);
        llInteger.addFirst(12);
        llInteger.addFirst(13);

        llInteger.add(4,14);
        llInteger.add(4,15);
        llInteger.printList();
    }

}
