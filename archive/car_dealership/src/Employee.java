public class Employee {

    // private String name;

    // public String getName() {
    //     return name;
    // }
    
    // public void setName(String name){
    //     this.name = name;
    // }

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){

        if(finance == true){

            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);

        } else if(vehicle.getPrice() <= cust.getCashOnHand()){

            processTransaction(cust, vehicle);
            
        } else {

            System.out.println("Customer need more money to purchase vehicle: " + vehicle);

        }
    }

    public void runCreditHistory(Customer cust, double loanAmount){
        // loanAmount = Vehicle.price - cashOnHand
        System.out.println("Running credit history for Customer...");
        System.out.println("Customer has been approved to purchase the vehicle");
    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle: " + vehicle);
    }

    /** Planing Employee class
     * 
     * handleCustomer( )
     *  if(finance == true)
     *      runCreditHistory(Customer cust, double doubleAmount)
     *  else if(vehicle.getPrice() <= cust.getCashOnHand()):
     *      processTransaction(Customer cust, Vehicle vehicle)
     *  else:
     *      tell custoemr to bring more money
     * 
     * 
     * 
     */
}
