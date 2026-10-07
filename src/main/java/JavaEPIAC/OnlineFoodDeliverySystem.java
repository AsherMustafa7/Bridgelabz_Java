/*
 * Problem 6: Online Food Delivery System
Create an abstract FoodItem with itemName, price, and quantity.
Add abstract calculateTotalPrice() and concrete getItemDetails().
Create VegItem and NonVegItem subclasses that override calculateTotalPrice().
NonVegItem should include an additional charge.
Create a Discountable interface with applyDiscount() and getDiscountDetails().
Use encapsulation to restrict changes to order details and polymorphism to process different food types in one method.
 *
 * Hint:
 * Keep common food data in FoodItem. Let each subclass calculate its total. Use Discountable for discount behavior.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaEPIAC;

import java.util.ArrayList;

// Define discount behavior.
interface Discountable {
    // Calculate the discount amount.
    double applyDiscount();

    // Return discount information.
    String getDiscountDetails();
}

// Define the common food item structure.
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Initialize common food item data.
    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = Math.max(price, 0);
        this.quantity = Math.max(quantity, 0);
    }

    // Return the item name.
    public String getItemName() {
        return itemName;
    }

    // Return the price.
    public double getPrice() {
        return price;
    }

    // Return the quantity.
    public int getQuantity() {
        return quantity;
    }

    // Update quantity only when it is valid.
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    // Require subclasses to calculate their total price.
    public abstract double calculateTotalPrice();

    // Display common food item details.
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + calculateTotalPrice());
    }
}

// Represent a vegetarian food item.
class VegItem extends FoodItem implements Discountable {

    // Initialize a vegetarian item.
    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Calculate the vegetarian item total.
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Calculate a 10 percent discount.
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    // Return discount information.
    @Override
    public String getDiscountDetails() {
        return "Veg item discount: 10%";
    }
}

// Represent a non-vegetarian food item.
class NonVegItem extends FoodItem implements Discountable {

    // Initialize a non-vegetarian item.
    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Calculate total with a five percent additional charge.
    @Override
    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity();
        double additionalCharge = baseTotal * 0.05;
        return baseTotal + additionalCharge;
    }

    // Calculate an eight percent discount.
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.08;
    }

    // Return discount information.
    @Override
    public String getDiscountDetails() {
        return "Non-veg item discount: 8%";
    }
}

// Test polymorphic food processing.
class OnlineFoodDeliverySystem {

    // Process different food types through FoodItem references.
    static void processOrder(ArrayList<FoodItem> items) {
        for (FoodItem item : items) {
            double discount = 0;

            // Use the Discountable interface when available.
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discount = discountable.applyDiscount();
            }

            // Calculate the final price after discount.
            double finalPrice = item.calculateTotalPrice() - discount;

            item.getItemDetails();
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create one list for different food item types.
        ArrayList<FoodItem> order = new ArrayList<>();

        // Add different food types to the same order.
        order.add(new VegItem("Paneer Wrap", 180, 2));
        order.add(new NonVegItem("Chicken Burger", 250, 2));

        // Process the order polymorphically.
        processOrder(order);
    }
}
