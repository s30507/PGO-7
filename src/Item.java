import java.util.ArrayList;

public class Item {
    String IDPrzedmiotu;
    String nazwa;

    public Item(String IDPrzedmiotu, String nazwa) {
        this.IDPrzedmiotu = IDPrzedmiotu;
        this.nazwa = nazwa;
    }

    public String show(){
        return nazwa;
    }


}