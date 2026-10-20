
/*
 * Question:
 * Develop a Smart Warehouse Management System to store and retrieve
 * Electronics, Groceries, and Furniture while maintaining type safety.
 *
 * Hint:
 * Create an abstract WarehouseItem class and a generic Storage class
 * with the bounded type parameter T extends WarehouseItem.
 * Use List<? extends WarehouseItem> to display different item types.
 *
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaGenerics.AssignmentsOfJavaGenerics.SmartWarehouseManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Abstract parent class for every warehouse item.
abstract class WarehouseItem {
    private int id;
    private String name;
    private double price;

    // Initialize the common properties of an item.
    public WarehouseItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Return the item ID.
    public int getId() {
        return id;
    }

    // Return the item name.
    public String getName() {
        return name;
    }

    // Return the item price.
    public double getPrice() {
        return price;
    }

    // Display the common item information.
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name
                + ", Price: " + price);
    }
}

// Electronics is a type of WarehouseItem.
class Electronics extends WarehouseItem {
    private int warrantyMonths;

    public Electronics(int id, String name, double price,
                       int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Warranty: " + warrantyMonths + " months");
    }
}

// Groceries is a type of WarehouseItem.
class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(int id, String name, double price,
                     String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

// Furniture is a type of WarehouseItem.
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(int id, String name, double price, String material) {
        super(id, name, price);
        this.material = material;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Material: " + material);
    }
}

// T must be WarehouseItem or one of its subclasses.
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    // Store an item of the permitted type.
    public void addItem(T item) {
        items.add(item);
        System.out.println(item.getName() + " added to storage.");
    }

    // Retrieve an item by its list position.
    public T getItem(int index) {
        if (index < 0 || index >= items.size()) {
            return null;
        }

        return items.get(index);
    }

    // Return the items for read-only-style wildcard processing.
    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouseManagementSystem {

    // Accept lists containing any WarehouseItem subtype.
    public static void displayItems(
            List<? extends WarehouseItem> items) {

        for (WarehouseItem item : items) {
            item.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create storage dedicated to electronics.
        Storage<Electronics> e = new Storage<>();

        // Create storage dedicated to groceries.
        Storage<Groceries> g = new Storage<>();

        // Create storage dedicated to furniture.
        Storage<Furniture> f = new Storage<>();

        // Add items to their respective storage collections.
        e.addItem(new Electronics(1, "Laptop", 65000, 24));
        g.addItem(new Groceries(2, "Rice", 1200, "2027-12-31"));
        f.addItem(new Furniture(3, "Chair", 2500, "Wood"));

        // Retrieve an electronics item using its index.
        System.out.println("\nRetrieved Item:");
        e.getItem(0).display();

        // Display electronics regardless of the concrete subtype.
        System.out.println("\nElectronics Storage:");
        displayItems(e.getItems());

        // Display groceries.
        System.out.println("Grocery Storage:");
        displayItems(g.getItems());

        // Display furniture.
        System.out.println("Furniture Storage:");
        displayItems(f.getItems());
    }
}
