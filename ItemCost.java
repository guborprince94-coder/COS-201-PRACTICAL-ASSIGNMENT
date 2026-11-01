import java.util.Scanner;

/**
 * ItemCost
 * Reads an item name, its unit price and the quantity bought, then
 * calculates the subtotal, 7.5% VAT and the total amount payable.
 */
public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double VAT_RATE = 0.075; // 7.5% VAT

        System.out.println("=== Item Cost Calculator ===");

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        double subtotal = unitPrice * quantity;
        double vat = subtotal * VAT_RATE;
        double totalCost = subtotal + vat;

        System.out.println();
        System.out.println("Item:       " + itemName);
        System.out.printf("Unit price: %.2f%n", unitPrice);
        System.out.println("Quantity:   " + quantity);
        System.out.printf("Subtotal:   %.2f%n", subtotal);
        System.out.printf("VAT (7.5%%): %.2f%n", vat);
        System.out.printf("Total cost: %.2f%n", totalCost);

        input.close();
    }
}
