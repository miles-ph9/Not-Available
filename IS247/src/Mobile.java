public class Mobile {

    private String manufacture;
    private String operatingSystem;
    private String model;
    protected Double cost;


    Mobile(String manufacture, String operatingSystem,String model,Double cost){

        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.cost = cost;

    }

    public Mobile (String manufacture, String operatingSystem){
         this(manufacture, operatingSystem, "Unknown", 0.0);
    }

    @Override

    public String toString(){
        return "Manufacturer: " + manufacture + ", OS:" + operatingSystem + ", Model:" + model + ", Cost: $" + cost;
    }

    public double getDiscountedPrice(){
        return cost * 0.20;
    }

}
