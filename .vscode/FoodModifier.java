public class FoodModifier {
    public void modify(Food food, String newName, double newPrice) {
        food.name = newName;
        food.price = newPrice;
        System.out.println("Makanan telah dimodifikasi.");
    }
}