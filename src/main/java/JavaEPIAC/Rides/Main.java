package JavaEPIAC.Rides;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Asher");
        Driver driver = new Driver("Rahul");
        Vehical vehical = new Car();
        Payment payment = new UPI();
        Ride ride = new Ride(customer, driver, vehical, payment);
        customer.bookRide(ride, 10);
    }
}
