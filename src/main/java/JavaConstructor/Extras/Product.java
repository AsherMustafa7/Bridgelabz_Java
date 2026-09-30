package JavaConstructor.Extras;
/*
 * Question:
 * Product Inventory: Create Product with instance variables productName and price, class variable totalProducts, instance method displayProductDetails(), and class method displayTotalProducts().
 *
 * Hint:
 * Use static for totalProducts and displayTotalProducts(). Increment totalProducts in the constructor.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000.0);
        Product p2 = new Product("Mouse", 1200.0);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
