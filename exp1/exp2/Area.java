import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area rectangle = new Area();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        rectangle.setDim(length, breadth);

        System.out.println("Area of rectangle: " + rectangle.getArea());

        scanner.close();
    }
}
