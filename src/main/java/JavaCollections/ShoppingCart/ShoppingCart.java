
/*
 * Question: Implement a Shopping Cart
 * Use HashMap for product prices, LinkedHashMap for cart insertion order,
 * and TreeMap to display cart items sorted by unit price.
 * Hint: Group product names by price in a TreeMap so equal prices
 * do not overwrite each other.
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaCollections.ShoppingCart;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        // Store product prices in a HashMap.
        Map<String, Double> prices = new HashMap<>();
        prices.put("Keyboard", 1500.0);
        prices.put("Mouse", 700.0);
        prices.put("Monitor", 9000.0);
        prices.put("USB Cable", 250.0);

        // Store cart quantities in the order items are added.
        Map<String, Integer> cart = new LinkedHashMap<>();
        cart.put("Keyboard", 1);
        cart.put("Mouse", 2);
        cart.put("USB Cable", 3);
        cart.put("Monitor", 1);

        // Create a TreeMap to group products by ascending unit price.
        Map<Double, List<String>> sortedByPrice = new TreeMap<>();

        // Visit each product in the cart.
        for (String product : cart.keySet()) {
            // Retrieve the product's unit price.
            double price = prices.get(product);

            // Create a product list for this price if needed.
            sortedByPrice.computeIfAbsent(
                    price, key -> new ArrayList<>());

            // Add the product to the price group.
            sortedByPrice.get(price).add(product);
        }

        // Display the product-price map.
        System.out.println("Product prices: " + prices);

        // Display items in the order they were added.
        System.out.println("\nCart insertion order:");

        // Initialize the cart total.
        double total = 0;

        // Calculate each item's total cost.
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            double lineTotal = prices.get(entry.getKey())
                    * entry.getValue();

            // Add the line total to the final amount.
            total += lineTotal;

            // Display the product, quantity, and cost.
            System.out.println(entry.getKey() + " x "
                    + entry.getValue() + " = " + lineTotal);
        }

        // Display products sorted by unit price.
        System.out.println("\nCart sorted by unit price:");
        for (Map.Entry<Double, List<String>> entry
                : sortedByPrice.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(
                        product + " : " + entry.getKey());
            }
        }

        // Display the final cart amount.
        System.out.println("\nTotal: " + total);
    }
}
