import java.util.Iterator;
import java.util.LinkedList;

// 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addLast("one");
        list.addLast("two");
        list.addLast("three");
        list.addLast("four");

        printList(list);
        System.out.println();

        list = reverse(list);

        printList(list);
    }

    public static void printList(LinkedList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static LinkedList<String> reverse(LinkedList<String> list) {
        LinkedList<String> res = new LinkedList<String>();

        Iterator<String> itr = list.descendingIterator();
        while (itr.hasNext())
            res.add(itr.next());

        return res;
    }
}
