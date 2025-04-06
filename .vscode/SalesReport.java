import java.util.ArrayList;
import java.util.List;

public class SalesReport implements Reportable {
    private List<Transaction> transactions;

    public SalesReport() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        System.out.println("Menambahkan transaksi ke laporan penjualan");
        transactions.add(transaction);
    }

    @Override
    public void generateSalesReport() {
        System.out.println("Laporan Penjualan:");
        if (transactions.isEmpty()) {
            System.out.println("Tidak ada transaksi.");
            return;
        }
        for (Transaction transaction : transactions) {
            System.out.println("Menampilkan transaksi.");
            transaction.viewTransactions();
        }
    }
}