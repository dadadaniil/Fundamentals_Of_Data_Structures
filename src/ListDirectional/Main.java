package ListDirectional;

class Main {
    public static void main(String[] args) {
        List list = new List();
        list.push("one");
        list.push("two");
        list.push("three");
        list.push("four");
        list.push("five");
        list.setOnDefinitivePlace(2,"dik");

        System.out.println(list.size());
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.get(list.size()-1));
    }
}