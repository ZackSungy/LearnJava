package Chapter9.listIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args)
    {
        List<String> staff = new LinkedList<>();
        staff.add("A");
        staff.add("B");
        staff.add("C");
        printItem(staff);

        staff.remove(2);
        printItem(staff);

        ListIterator iter = staff.listIterator();
        iter.next();
        iter.add("E");
        iter.add("F");
        printItem(staff);
    }

    public static void printItem(List<?> list)
    {
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println();
    }
}
