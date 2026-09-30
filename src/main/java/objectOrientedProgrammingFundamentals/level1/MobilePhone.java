package objectOrientedProgrammingFundamentals.level1;
/*
 * Question:
 * Program to Handle Mobile Phone Details
 * Problem Statement:
 * Create a MobilePhone class with attributes brand, model, and price.
 * Add a method to display all the details of the phone.
 * The MobilePhone class uses attributes to store the phone characteristics.
 * The method is used to retrieve and display this information for each object.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */
public class MobilePhone {
    private String brand;
    private String model;
    private double price;
    // constructor
    public MobilePhone(String brand, String model, double price)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public void setPrice(double price)
    {
        if(price >0)
        this.price=price;
        else
        {
            System.out.println("Price cannot be negative");
        }
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public void setModel(String model)
    {
        this.model=model;
    }

    public void displaydetails()
    {
        System.out.println("Brand of the phone: "+ brand);
        System.out.println("Model of the phone: "+ model);
        System.out.println("Price of the phone: "+ price);
    }
    public static void main (String[] args)
    {
        MobilePhone m= new MobilePhone("Nokia","S22",100000.00);
        System.out.println("Display using get methords: ");
        System.out.println("Display brand get methords: "+ m.getBrand());
        System.out.println("Display model get methords: "+ m.model);
        System.out.println("Display price get methords: "+ m.getPrice());
        System.out.println("changing the Price");
        m.setPrice(20000.00);
        System.out.println("Display using display methord");
        m.displaydetails();
    }
}
