package JavaEPIAC.Rides;

class Creditcard implements Payment {
    public void pay(double amount) {
        System.out.println("paid amount : " + amount + " using Credit card");
    }
}
