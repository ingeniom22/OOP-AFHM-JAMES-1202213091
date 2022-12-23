import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant machine = new Restaurant();
        int customerID, orderQty;
        try {
            System.out.println("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.println("Enter how many food to make: ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(machine);
            Waiters waiters = new Waiters(orderQty, customerID);
            Thread t2 = new Thread(waiters);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }
        input.close();

    }

}