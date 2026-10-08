package JavaEPIAC.Rides;

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("paid amount : " + amount + " using UPI");
    }
}
