import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        // TODO Create Database
        Database database = new Database();

        // TODO Create Menu
        Menu bakso = new Menu("Bakso", "Makanan", 15000);
        Menu ayamGoreng = new Menu("Ayam goreng", "Makanan", 20000);
        Menu esTeh = new Menu("Es Teh", "Minuman", 10000);

        // TODO Insert Menu to Database
        database.insertMenu(bakso);
        database.insertMenu(ayamGoreng);
        database.insertMenu(esTeh);

        // TODO Display Main Menu
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di restoran EAD");
        System.out.println("Silahkan registrasi terlebih dahulu");
        System.out.println("============================================");
        System.out.println("Nama : ");
        String name = input.nextLine();
        System.out.println("Phone number: ");
        String phoneNumber = input.nextLine();

        User newUser = new User(name, phoneNumber);
        newUser.displayUser();

        // TODO Create User

        // Display Menu
        System.out.println("============================================");
        System.out.println("1. Menu");
        System.out.println("2. Pilih Menu");
        System.out.println("3. Keluar");
        System.out.println("============================================");
        System.out.println("Masukkan pilihan: ");
        int option = input.nextInt();
        if (option == 1) {
            database.showMenu();
            System.out.println("Masukkan pilihan: ");
        } else if (option == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan nama menu: ");
            String myMenu = scanner.nextLine();
            database.findMenu(myMenu);
            scanner.close();
        } else {
            System.out.println("Program selesai dijalankan");
        }

        input.close();
    }
}
