public class Practical33 {
    public static void main(String[] args) {

        System.out.println("yachika jain : 240390107056\n");

        try {
                int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result = " + result);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two numbers!");
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers!");
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        finally {
            System.out.println("Program executed.");
        }
    }
}
