package SimpleListWithArray;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.insert(11, 3);
        System.out.println("Size - " + list.size());
        list.delete(30);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
