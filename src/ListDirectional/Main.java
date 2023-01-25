package ListDirectional;

class Main {
    public static void main(String[] args) {
        List list = new List();
        list.pushBack("one");
        list.pushBack("two");
        list.pushBack("three");
        list.pushBack("four");
        list.pushBack("five");
        list.set(2,"dik");

        System.out.println(list.size());
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.get(list.size()-1));
    }
}