package Iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by hiroto on 2015/07/04.
 */
public class MyArrayListIterator<T> implements Iterator<T> {
    private MyArrayList _baseObj;
    private Node<T> _follow;
    public MyArrayListIterator(MyArrayList myArrayList) {
        _baseObj = myArrayList;
        _follow=_baseObj.head;
    }
    @Override
    public boolean hasNext() {
        if(_follow==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public T next() {
        if(_follow==null) {
            return null;
        }
        else {
                T value = _follow.getValue();
                _follow = _follow.getNext();
                return value;
        }
    }

    @Override
    public void remove() {

    }
}
