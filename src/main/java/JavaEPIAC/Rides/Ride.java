package JavaEPIAC.Rides;

class Ride {
    Customer customer;
    Driver driver;
    Vehical vehical;
    Payment payment;

    Ride(Customer customer, Driver driver, Vehical vehical, Payment payment) {
        this.customer = customer;
        this.driver = driver;
        this.vehical = vehical;
        this.payment = payment;
    }

    void bookride(double distance) {
        double price = vehical.calculateFare(distance);
        System.out.println("Customer: " + customer.name);
        System.out.println("Driver: " + driver.name);
        System.out.println("Vehical: " + vehical.name);
        System.out.println("Distance: " + distance);
        System.out.println("price: " + price);
        payment.pay(price);
    }
}
