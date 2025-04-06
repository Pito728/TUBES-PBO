public class Food extends Item {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public void modify(String newName, double newPrice) {
        this.name = newName;
        this.price = newPrice;
        System.out.println("Item makanan berhasil diubah");
    }
}
    

