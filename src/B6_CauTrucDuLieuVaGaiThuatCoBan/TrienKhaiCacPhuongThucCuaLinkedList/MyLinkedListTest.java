package B6_CauTrucDuLieuVaGaiThuatCoBan.TrienKhaiCacPhuongThucCuaLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING MyLinkedList<Integer> /=/=/=/=");
        MyLinkedList<Integer> llInteger = new MyLinkedList<Integer>();
        llInteger.addFirst(11);
        llInteger.addFirst(12);
        llInteger.addFirst(13);
        llInteger.addLast(14);
        llInteger.addFirst(16);
        llInteger.add(5,15);
        System.out.println("remove index 5 has value "+llInteger.remove(5));
//        llInteger.add(4,15);
        llInteger.printList();
    }

}
