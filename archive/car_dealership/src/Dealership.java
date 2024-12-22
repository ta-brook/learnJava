public class Dealership {
    public static void main(String[] args){

        Customer cust = new Customer("Tom", "32 St.", 15000);
        // cust.setName("Tom");
        // cust.setAddress("32 na St. ");
        // cust.setCashOnHand(12000);

        Employee emp = new Employee();

        Vehicle vehicle = new Vehicle("Vespa", "giorni", 10000);
        // vehicle.setModel("Vespa");
        // vehicle.setModel("giorni");
        // vehicle.setPrice(10000);

        cust.purchaseCar(vehicle, emp, true);

    }
}
