package node;
import java.util.*;
public class Node {
    Node previous;
    double data;
    Node next;

    public Node(double data) {
        this.data = data;
    }

    public Node(Node previous, double data, Node next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Node{" +
                "previous=" + previous +
                ", data=" + data +
                ", next=" + next +
                '}';
    }
}
