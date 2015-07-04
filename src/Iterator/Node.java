package Iterator;

/**
 * Created by hiroto on 2015/07/04.
 */
public class Node<T> {
        protected Node<T> next;
        private T value;
        public Node(T value) {
            this.value = value;
        }
        public T getValue() {
            return value;
        }
        public void setValue(T value) {
            this.value = value;
        }
        public void setNext(Node<T> next) {
            this.next = next;
        }
        public Node<T> getNext() {
            return next;
        }
}