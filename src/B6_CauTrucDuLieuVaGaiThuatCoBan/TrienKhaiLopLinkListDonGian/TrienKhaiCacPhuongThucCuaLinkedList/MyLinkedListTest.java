package B6_CauTrucDuLieuVaGaiThuatCoBan.TrienKhaiLopLinkListDonGian.TrienKhaiCacPhuongThucCuaLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(9);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,14);
        ll.add(4,15);
        ll.printList();
    }

}
