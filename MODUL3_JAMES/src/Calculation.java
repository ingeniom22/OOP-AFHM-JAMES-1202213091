public class Calculation implements Runnable {
    double radius;
    double side;
    double area;
    double phi = 3.14;

    public double getSquare() {
        return area;
    }

    public void setSquare(double side) {
        try {
            this.area = side * side;
            if (side < 1) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    public double getCircle() {
        return area;
    }

    public void setCircle(double radius) {
        try {
            this.area = this.phi * radius * radius;
            if (radius < 1) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public double getTrapezoid() {
        return area;
    }

    public void setTrapezoid(double a, double b, double t) {
        try {
            this.area = (a + b) * t / 2;
            if (a < 1 || b < 1 || t < 1) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("program akan berjalan dalam");
            for (int i = 3; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
