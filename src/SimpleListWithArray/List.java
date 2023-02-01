package SimpleListWithArray;

public class List {
    private int[] p;
    private int count;

    public List() {
        count = 0;
    }

    public void add(int item) {
        int[] p2;
        p2 = p;
        p = new int[count + 1];
        for (int i = 0; i < count; i++) {
            p[i] = p2[i];
        }
        p[count] = item;
        count++;
    }

    public void delete(int index) {
        if (index < 0 || index > count - 1) {
            throw new RuntimeException("Index is invalid.");
        }
        for (int i = index; i < p.length - 2; i++) {
            p[i] = p[i + 1];
        }
    }

    public void replace(int itemToReplace, int index) {
        if (index < 0 || index > count - 1) {
            throw new RuntimeException("Index is invalid.");
        }
        p[index] = itemToReplace;
    }

    public void insert(int item, int index) {
        if (index < 0 || index > count) {
            throw new RuntimeException("Queue is clear.");
        }
        if (index == count) {
            add(item);
            return;
        }
        int[] p2;
        p2 = p;
        p = new int[count + 1];
        for (int i = 0; i < index; i++) {
            p[i] = p2[i];
        }
        for (int i = index + 1; i < count + 1; i++) {
            p[i] = p2[i - 1];
        }
        p[index] = item;
        count++;
    }

    public int get(int index) {
        if (index < 0 || index > count - 1) {
            throw new RuntimeException("Index is invalid.");
        }
        return p[index];
    }

    public int pop() {
        if (count == 0) {
            throw new RuntimeException("Index is invalid.");
        }
        int item;
        item = p[0];
        int[] p2;
        p2 = new int[count - 1];
        count--;
        for (int i = 0; i < count; i++) {
            p2[i] = p[i + 1];
        }
        p = p2;
        return item;
    }

    public int getFirst() {
        if (count == 0) {
            throw new RuntimeException("Queue is clear.");
        }
        return p[0];
    }

    public void clear() {
        p = null;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}