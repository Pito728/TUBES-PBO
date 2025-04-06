public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void register(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Akun berhasil didaftarkan");
    }
}