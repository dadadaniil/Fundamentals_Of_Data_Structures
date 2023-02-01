package ListDirectional;

class List {
    private Node first;
    private Node last;

    public List() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String value) {
        Node p = new Node(value);
        if (isEmpty()) {
            first = p;
            last = p;
            return;
        }
        last.setNext(p);
        last = p;
    }

    public int size() {
        int count = 0;
        Node current = first;

        while (current != last) {
            count++;
            current = current.getNext();
        }
        count++;
        return count;
    }

    public String get(int index) {
        if (index < 0 || index > size() - 1) {
            throw new RuntimeException("Index is invalid.");
        }

        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getVal();
    }

    public void setOnDefinitivePlace(int index, String value) {
        if (index < 0 || index > size() - 1) {
            throw new RuntimeException("Index is invalid.");
        }
        Node p = new Node(value);
        Node current = first;

        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        current.setVal(value);
    }
}