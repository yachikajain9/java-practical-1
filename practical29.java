import java.util.Scanner;
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}
abstract class PartialOrder implements Order {

    protected String itemName;
    protected int quantity;
    protected int orderId;

    @Override
    public void placeOrder(String item, int qty) {
        this.itemName = item;
        this.quantity = qty;
        this.orderId = (int)(Math.random() * 1000); // generate random order ID

        System.out.println("Order placed successfully!");
        System.out.println("Order ID: " + orderId);
    }
}
class FinalOrder extends PartialOrder {

    double pricePerItem = 100; 
    @Override
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order " + orderId + " has been cancelled.");
        } else {
            System.out.println("Invalid Order ID!");
        }
    }

    // Generate Bill
    @Override
    public void generateBill() {
        double total = quantity * pricePerItem;

        System.out.println("\n----- Bill -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: Rs. " + pricePerItem);
        System.out.println("Total Amount: Rs. " + total);
    }
}

public class Practical29 {
    public static void main(String[] args) {
	System.out.println("yachika : 240390107056");
        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

        System.out.println("\nChoose an option:");
        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");
        int choice = sc.nextInt();

        if (choice == 1) {
            order.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID to cancel: ");
            int id = sc.nextInt();
            order.cancelOrder(id);
        } else {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}