package objectOrientedProgrammingFundamentals.level1;
/*
 * Question:
 * Program to Track Inventory of Items
 * Problem Statement:
 * Create an Item class with attributes itemCode, itemName, and price.
 * Add a method to display item details and calculate the total cost
 * for a given quantity.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */
public class Item {
    // Store the item code.
    private int itemCode;
    // Store the item name.
    private String itemName;
    // Store the price of one item.
    private double price;

    // Constructor initializes all item attributes.
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Return the item code.
    public int getItemCode() {
        return itemCode;
    }

    // Set the item code.
    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    // Return the item name.
    public String getItemName() {
        return itemName;
    }

    // Set the item name.
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Return the item price.
    public double getPrice() {
        return price;
    }

    // Set the item price.
    public void setPrice(double price) {
        this.price = price;
    }

    // Calculate the total cost for a quantity.
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Display item details and total cost.
    public void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }

    // Create an item object and display its details.
    public static void main(String[] args) {
        Item item = new Item(1001, "Notebook", 80);
        int quantity = 5;
        item.displayDetails(quantity);
    }
}
