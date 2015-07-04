package Iterator;

import java.util.Iterator;

/**
 * Created by hiroto on 2015/07/04.
 */
public class Exec {
    public static void main(String args[]) {
        MyArrayList<Integer> list = new MyArrayList<Integer>(1,2,3,4,5,6,7,8,9,10);
        list.DebugPrint();
        System.out.println();
        Iterator<Integer> it = list.myArrayListIterator();
        while(it.hasNext()) {
            Integer node = it.next();
            System.out.println(node);
        }
        for(Integer val : list) {
            System.out.println(val);
        }
    }
}
