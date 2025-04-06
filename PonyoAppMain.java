import java.util.Scanner;

public class PonyoAppMain {
    private static Scanner scanner = new Scanner(System.in);
    private static Menu menu = new Menu();
    private static Transaction transaction = new Transaction();
    private static SalesReport salesReport = new SalesReport();
    private static Promo promo = new Promo();

    public static void main(String[] args) {
        setupMenu();
        while (true) {
            System.out.println("\n=== Ponyo App ===");
            System.out.println("1. Register Account");
            System.out.println("2. Browse Menu");
            System.out.println("3. Order Food");
            System.out.println("4. Order Drink");
            System.out.println("5. View Promo");
            System.out.println("6. View Transactions");
            System.out.println("7. Modify Food");
            System.out.println("8. Modify Drink");
            System.out.println("9. Generate Sales Report");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerAccount();
                    break;
                case 2:
                    browseMenu();
                    break;
                case 3:
                    orderFood();
                    break;
                case 4:
                    orderDrink();
                    break;
                case 5:
                    viewPromo();
                    break;
                case 6:
                    viewTransactions();
                    break;
                case 7:
                    modifyFood();
                    break;
                case 8:
                    modifyDrink();
                    break;
                case 9:
                    generateSalesReport();
                    break;
                case 10:
                    System.out.println("Terima Kasih!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void setupMenu() {
        Food food1 = new Food("Nasi Goreng", 20000);
        Drink drink1 = new Drink("Teh Manis", 5000);
        menu.addItem(food1);
        menu.addItem(drink1);
    }

    private static void registerAccount() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        Account account = new Account(username, password);
        account.register(username, password);
    }

    private static void browseMenu() {
        System.out.println("Menu:");
        menu.browseMenu();
    }

    private static void orderFood() {
        System.out.print("Enter food name: ");
        String foodName = scanner.nextLine();
        for (Item item : menu.items) {
            if (item instanceof Food && item.name.equals(foodName)) {
                transaction.orderItem(item);
                return;
            }
        }
        System.out.println("Makanan Tidak Ditemukan.");
    }

    private static void orderDrink() {
        System.out.print("Enter drink name: ");
        String drinkName = scanner.nextLine();
        for (Item item : menu.items) {
            if (item instanceof Drink && item.name.equals(drinkName)) {
                transaction.orderItem(item);
                return;
            }
        }
        System.out.println("Minuman Tidak Ditemukan.");
    }

    private static void viewPromo() {
        promo.viewPromo();
    }

    private static void viewTransactions() {
        transaction.viewTransactions();
        transaction.viewStatus();
    }

    private static void modifyFood() {
        System.out.print("Enter food name to modify: ");
        String foodName = scanner.nextLine();
        for (Item item : menu.items) {
            if (item instanceof Food && item.name.equals(foodName)) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                item.modify(newName, newPrice);
                return;
            }
        }
        System.out.println("Makanan Tidak Ditemukan.");
    }

    private static void modifyDrink() {
        System.out.print("Enter drink name to modify: ");
        String drinkName = scanner.nextLine();
        for (Item item : menu.items) {
            if (item instanceof Drink && item.name.equals(drinkName)) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                item.modify(newName, newPrice);
                return;
            }
        }
        System.out.println("Minuman Tidak Ditemukan.");
    }

    private static void generateSalesReport() {
        salesReport.addTransaction(transaction);
        salesReport.generateSalesReport();
    }
}