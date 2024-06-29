import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> kontener = new ArrayList<>();
        HashMap<String, String> HashMap = new HashMap();
        HashSet<Item> HashSet = new HashSet<>();

        Item item1 = new Item ("1", "dlugopis");
        Item item2 = new Item("2", "olowek");
        Item item3 = new Item("3", "gumka");
        Item item4 = new Item("4", "temperowka");
        Item item5 = new Item("5", "nozyczki");
        kontener.add(item1);
        kontener.add(item2);
        kontener.add(item3);
        kontener.add(item4);
        kontener.add(item5);
        for(int i=0; i<kontener.size(); i++) {
            kontener.get(i).show();
        }
        for(Item item: kontener) {
            HashMap.put(item.IDPrzedmiotu, item.nazwa);
        }
        Set<HashMap.Entry<String, String>> entrySet = HashMap.entrySet();
        for(HashMap.Entry<String, String> entry: entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Item item6 = new Item ("6", "biurko");
        Item item7 = new Item("7", "krzeslo");
        Item item8 = new Item("8", "lozko");
        Item item9 = new Item("9", "stol");
        Item item10 = new Item("10", "lampka");
        Item item11 = new Item ("11", "doniczka");
        Item item12 = new Item("12", "kwiat");
        Item item13 = new Item("13", "podstawka");
        Item item14 = new Item("14", "laptop");
        Item item15= new Item("15", "linijka");
        kontener.add(item6);
        kontener.add(item7);
        kontener.add(item8);
        kontener.add(item9);
        kontener.add(item10);
        kontener.add(item11);
        kontener.add(item12);
        kontener.add(item13);
        kontener.add(item14);
        kontener.add(item15);

        HashSet = new HashSet<>(kontener.subList(5,10));


    }
}