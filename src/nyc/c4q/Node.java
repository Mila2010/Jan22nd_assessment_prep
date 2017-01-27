package nyc.c4q;

/**
 * Created by Millochka on 1/23/17.
 */
public class Node {
    public Node next;
    public Object value;

    public Node(Object data) {
        this.value = data;
        this.next = null ;
    }

    public Node getNext() {
        return next;
    }

    public Object getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
