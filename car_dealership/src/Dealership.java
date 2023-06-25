public class Dealership {
    
    public static void main(String args){

        Customer cust1 = new Customer();
        cust1.setName("Tom");
        cust1.setAddress("321 na St. ");
        cust1.setCashOnHand(12000);

        cust1.purchaseCar(null, null, false);


        /** Planing
         * 
         * handelCustomer( Customer cust, boolean finance, Vehicle vehicle)
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
}
