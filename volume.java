import java.util.Scanner;

class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VolumeCalculator obj = new VolumeCalculator();

        System.out.println("Choose Shape:");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Cube");
        System.out.println("3. Sphere");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter side of cube: ");
                double side = sc.nextDouble();
                System.out.println("Volume of Cube: " + obj.calculateVolume(side));
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                System.out.println("Volume of Rectangular Cube: " 
                        + obj.calculateVolume(length, width, height));
                break;

            case 3:
                System.out.print("Enter radius of sphere: ");
                float radius = sc.nextFloat();
                System.out.println("Volume of Sphere: " 
                        + obj.calculateVolume(radius));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}