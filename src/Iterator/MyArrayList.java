package Iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by hiroto on 2015/07/04.
 */
public class MyArrayList<T> implements Aggregate<T>,Iterable<T>{
    protected Node<T> head;
    public MyArrayList() {
        head = null;
    }
    //‰Â•Ï’·ˆø”‚Å•¡”“o˜^
    public MyArrayList(T ... arg) {
        this();
        for(T items : arg) {
            add(items);
        }
    }

    public void add(T value) {
        if(head == null) {
            head = new Node<T>(value);
        }
        else {
            Node<T> follow = head;
            while(follow.getNext() != null) {
                follow = follow.getNext();
            }
            follow.setNext(new Node<T>(value));
        }
    }
    @Deprecated
    public void DebugPrint() {
        Node<T> follow = head;
        if(head==null) {
            System.out.print(head);
        }
        else {
            System.out.print(follow.getValue() + "->");
            while (follow.getNext() != null) {
                follow = follow.getNext();
                System.out.print(follow.getValue() + "->");
            }
        }
    }

    @Override
    public Iterator myArrayListIterator() {
        return new MyArrayListIterator<T>(this);
    }

    @Override
    public Iterator iterator() {
        return this.myArrayListIterator();
    }

}

