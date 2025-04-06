import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Item> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void browseMenu(){
        for (Item item : items) {
            System.out.println("Nama: " + item.name + ", Harga:" + item.price);
        }
    }
}