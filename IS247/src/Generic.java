public class Generic extends Mobile {

    public Generic (String manufacture, String operatingSystem, String model, Double cost){
        super(manufacture,operatingSystem,model,cost);

    }

    public Generic (String manufacture, String operatingSystem){
        super(manufacture, operatingSystem);
    }

    @Override
    public double getDiscountedPrice(){
        return cost * 0.95;
    }
}
