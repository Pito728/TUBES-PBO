
public class Drink extends Item {
    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public void modify(String newName, double newPrice) {
        this.name = newName;
        this.price = newPrice;
        System.out.println("Item minuman berhasil diubah");
    }
    
}
