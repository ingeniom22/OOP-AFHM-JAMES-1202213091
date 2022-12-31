import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    static boolean repeat = true;

    public static void main(String[] args) throws Exception {
        Calculation cal = new Calculation();

        Scanner input = new Scanner(System.in);

        do {
            try {
                System.out.println("Menu program");
                System.out.println("1. Square");
                System.out.println("2. Circle");
                System.out.println("3. Trapezoid");
                int option = input.nextInt();

                switch (option) {
                    case 1:
                        double side = input.nextDouble();
                        cal.setSquare(side);
                        double squareArea = cal.getSquare();
                        cal.run();

                        System.out.println("the calculation result " + squareArea);
                        break;

                    case 2:
                        double radius = input.nextDouble();
                        cal.setCircle(radius);

                        double circleArea = cal.getCircle();
                        cal.run();

                        System.out.println("the calculation result " + circleArea);
                        break;

                    case 3:
                        double a = input.nextDouble();
                        double b = input.nextDouble();
                        double t = input.nextDouble();
                        cal.setTrapezoid(a, b, t);

                        double trapezoidArea = cal.getTrapezoid();
                        cal.run();

                        System.out.println("the calculation result " + trapezoidArea);
                        break;

                    default:
                        System.out.println("Invalid option");
                        continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Harus angka");
            }

            catch (IllegalArgumentException e) {
                e.printStackTrace();
            }

            System.out.println("repeat? : ");
            repeat = input.nextBoolean();

        } while (repeat == true);

        input.close();
    }
}
