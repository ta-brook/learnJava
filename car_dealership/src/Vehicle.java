public class Vehicle {
    
    // private String name;
    private String make;
    private String model;
    private double price;

    public Vehicle(String make, String model, double price){
        super();
        this.make = make;
        this.model = model;
        this.price = price;
    }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name){
    //     this.name = name;
    // }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String toString() {
        return "Vehicle";
    }

}
