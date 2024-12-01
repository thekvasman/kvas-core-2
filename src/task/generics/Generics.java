package task.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static <T> T getFirstElement(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return list.getFirst();
    }

    public static <T> T getLastElement(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return list.getLast();
    }

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> list3 = new ArrayList<>(list1);
        list3.addAll(list2);
        return list3;
    }

    public static <T> List<T> getUniqueElements(List<T> list) {

        List<T> list2 = new ArrayList<>();

        for (T t : list) {
            if (!list2.contains(t)) {
                list2.add(t);
            }
        }
        return list2;
    }
}
