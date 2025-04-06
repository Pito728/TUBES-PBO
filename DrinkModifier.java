public class DrinkModifier {
    public void modify(Drink drink, String newName, double newPrice) {
        drink.name = newName;
        drink.price = newPrice;
        System.out.println("Minuman telah dimodifikasi.");
    }
}