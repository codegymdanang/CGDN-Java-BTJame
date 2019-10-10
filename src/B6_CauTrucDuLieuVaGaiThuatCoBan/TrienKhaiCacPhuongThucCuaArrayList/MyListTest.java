package B6_CauTrucDuLieuVaGaiThuatCoBan.TrienKhaiCacPhuongThucCuaArrayList;

public class MyListTest<E extends Cloneable> {

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(0, 2);
        listInteger.add(1, 3);
        listInteger.add(2, 4);
        listInteger.add(3, 6);
        showList(listInteger);
        System.out.println("size : " + listInteger.size());
        System.out.println("contain 5 : " + listInteger.contains(3));
        System.out.println("contain 3 : " + listInteger.contains(5));
        listInteger.add(8);
        showList(listInteger);
        System.out.println("size" + listInteger.size());
        MyList<Integer> listInteger2 = new MyList<Integer>();
        for (int i = 0; i < listInteger.size(); i++) {
            listInteger2.add(listInteger.get(i));
        }
        showList(listInteger2);
        listInteger.clear();
        showList(listInteger);
        System.out.println("size : " + listInteger.size());

    }

    private static void showList(MyList<Integer> listInteger1) {
        System.out.println("===========================================================");
        for (int i = 0; i < listInteger1.size(); i++) {
            System.out.println("i == " + i + " value :" + listInteger1.get(i));
        }
    }

}
