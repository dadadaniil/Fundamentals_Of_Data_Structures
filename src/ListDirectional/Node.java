package ListDirectional;

public class Node {
    private String val;
    private Node next;
    public Node(String value) {
        val = value;
        next = null;
    }


    public String getVal() {
        return val;
    }
    public void setVal(String val) {
        this.val = val;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }


}

