package kyu8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"ada","mvm","ifi","dsa");
        Iterator iterator = list.iterator();
        iterator.forEachRemaining(a -> a = "ss");
        while (iterator.hasNext()){
           iterator.next();
           iterator.remove();
        }
        System.out.println(list);
    }
}
