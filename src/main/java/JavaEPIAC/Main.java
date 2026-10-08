/*
3. Design a Ride Booking System
Design a simplified Uber/Ola-like Ride Booking System.
Requirements:
- Create different vehicle types: Bike, Car, and SUV.
- Each vehicle should calculate the fare differently.
- Create different users such as Customer and Driver.
- A customer should be able to book a ride.
- The system should calculate the fare based on distance and vehicle type.
- Support different payment methods.
- The design should allow adding a new vehicle type or payment method without changing existing business logic.
Expected concepts:
Inheritance, interfaces, abstraction, polymorphism, composition, loose coupling, SOLID principles, and design patterns such as Strategy Pattern.
Author: Asher Mustafa
Date: 07 -10- 2026
*/

package JavaEPIAC;

abstract class Vehical
{
    String name; // The name of the vehical

    Vehical(String name) // the Constructor
    {
        this.name=name;
    }

    abstract double calculateFare(double distance);
}

class Bike extends Vehical
{
    Bike()
    {
        super("Bike");
    }

    double calculateFare(double distance)
    {
        return distance*10;
    }
}

class Car extends Vehical
{
    Car()
    {
        super("Car");
    }

    double calculateFare(double distance)
    {
        return distance*20;
    }
}

class SUV extends Vehical
{
    SUV()
    {
        super("SUV");
    }

    double calculateFare(double distance)
    {
        return distance*300;
    }
}

// Creating the payment methord

interface Payment
{
    void pay(double amount);

}

// first is UPI
class UPI implements Payment
{
    public void pay(double amount)
    {
        System.out.println("paid amount : "+ amount+ "using UPI");
    }
}

// Now we can also do Credit card
class Creditcard implements Payment
{
    public void pay(double amount)
    {
        System.out.println("paid amount : "+ amount+ "using Credit card");
    }
}

//creating the different users such as customers and dirvers

class Customer
{
    String name;

    Customer(String name)
    {
        this.name=name;
    }

    void bookRide(Ride ride, double distance)
    {
        ride.bookride(distance);
    }
}

class Driver
{
    String name;

    Driver(String name)
    {
        this.name=name;
    }
}

// The RIDE CLASS

class Ride
{
    Customer customer;
    Driver driver;
    Vehical vehical;
    Payment payment;

    Ride(Customer customer, Driver driver, Vehical vehical, Payment payment)
    {
        this.customer=customer;
        this.driver=driver;
        this.vehical=vehical;
        this.payment=payment;
    }

    // making a function to basically call the calculate and then display the details
    void bookride(double distance)
    {
        double price= vehical.calculateFare(distance);

        System.out.println("Customer: "+ customer.name);
        System.out.println("Driver: "+ driver.name);
        System.out.println("Vehical: "+ vehical.name);
        System.out.println("Distance: "+ distance);
        System.out.println("price: "+ price);
        payment.pay(price);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Customer customer=new Customer("Asher");
        Driver driver=new Driver("Rahul");
        Vehical vehical=new Car();
        Payment payment=new UPI();
        Ride ride = new Ride(customer,driver,vehical,payment);
        customer.bookRide(ride, 10);
    }
}