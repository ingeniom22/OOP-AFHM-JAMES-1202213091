import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    private ArrayList<Menu> listMenu = new ArrayList<Menu>();

    // TODO Create Method to Insert Menu to Database
    public void insertMenu(Menu newMenu) {
        listMenu.add(newMenu);
    }

    // TODO Create Method to Show Menu from Database
    public void showMenu() {
        int i = 1;
        for (Menu menu : listMenu) {
            System.out.println(i + ". " + menu.getName() + " (" + menu.getCategory() + ") " + "Rp " + menu.getPrice());
            i++;
        }

    }

    // TODO Create Method to Search Menu from Database
    public void findMenu(String myMenu) {
        int i = 1;
        for (Menu menu : listMenu) {
            if (myMenu.equalsIgnoreCase(menu.getName())) {
                System.out
                        .println(
                                i + ". " + menu.getName() + " (" + menu.getCategory() + ") " + "Rp " + menu.getPrice());
            }
        }
    }

}
