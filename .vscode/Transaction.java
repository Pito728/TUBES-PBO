import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private List<Item> orderItems;
    private double totalAmount;

    public Transaction() {
        orderItems = new ArrayList<>();
        totalAmount = 0.0;
    }

    // method untuk memsan item makanan dan minuman
    public void orderItem(Item item) {
        orderItems.add(item);
        totalAmount += item.price;
        System.out.println("Item telah dipesan: " + item.name);
    }

    public void viewTransactions() {
        if (orderItems.isEmpty()){
            System.out.println("Tidak ada transaksi.");
            return;
        }
        for (Item item : orderItems) {
            System.out.println("Item: " + item.name + ", Harga: " + item.price);
        }
        System.out.println("Total: " + totalAmount);
    }

    public void viewStatus() {
        System.out.println("Status transaksi: Selesai");
    }
}
