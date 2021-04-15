import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {

        ArrayList<MyList> arrayList = new ArrayList<>();

        MyList myList = new MyList();


        myList.add(20);
        myList.add(2);
        myList.add(91);
        myList.add(21);


        arrayList.add(myList);

        for (MyList list: arrayList
             ) {
            System.out.println(list);
        }

        System.out.println(arrayList.size());
//        arrayList.remove(0);





//        arrayList.remove(arrayList.get(1));
//
//
//        for (MyList list: arrayList
//        ) {
//            System.out.println(list);
//        }
//        System.out.println(arrayList.size());
//        for (int i = 0; i < listInteger.size(); i++) {
//            System.out.println(listInteger.get(i));
//        }
//        listInteger.clear();
//        System.out.println(listInteger);

    }
}
