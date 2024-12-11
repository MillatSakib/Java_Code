import java.util.Scanner;

// Custom Exception Class
class NegativePriceException extends Exception {
    public NegativePriceException(String message) {
        super(message);
    }
}

public class ProductPriceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the price of the product: ");
            double price = scanner.nextDouble();

            // Check for negative price
            if (price < 0) {
                throw new NegativePriceException("Price cannot be negative!");
            }

            System.out.println("The price of the product is: " + price);
        } catch (NegativePriceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid price.");
        } finally {
            scanner.close();
        }
    }
}
