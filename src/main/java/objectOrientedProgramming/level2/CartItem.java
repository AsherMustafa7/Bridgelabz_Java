/*
 * Question:
 * Create a CartItem class with attributes itemName, price, and quantity.
 * Add methods to add an item to the cart, remove an item from the cart,
 * and display the total cost.
 *
 * Hint:
 * Use private attributes, a constructor, getter and setter methods,
 * and methods to change the quantity and calculate the total cost.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */

public class CartItem {

    // Store the item name
    private String itemName;

    // Store the price of one item
    private double price;

    // Store the number of items
    private int quantity;

    // Constructor to initialize item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter to return the item name
    public String getItemName() {
        return itemName;
    }

    // Setter to update the item name
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getter to return the item price
    public double getPrice() {
        return price;
    }

    // Setter to update the item price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter to return the quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter to update the quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Add more quantity of the item to the cart
    public void addItem(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
            System.out.println("Item quantity added.");
        } else {
            System.out.println("Quantity must be positive.");
        }
    }

    // Remove quantity of the item from the cart
    public void removeItem(int quantity) {
        if (quantity <= 0) {
            System.out.println("Quantity must be positive.");
        } else if (quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println("Item quantity removed.");
        } else {
            System.out.println("Cannot remove more items than available.");
        }
    }

    // Calculate and display the total cost
    public void displayTotalCost() {
        double totalCost = price * quantity;

        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    // Main method to test the CartItem class
    public static void main(String[] args) {
        // Create a CartItem object
        CartItem item = new CartItem("Laptop Bag", 1200, 2);

        // Add one more item
        item.addItem(1);

        // Remove one item
        item.removeItem(1);

        // Display the total cost
        item.displayTotalCost();
    }
}
