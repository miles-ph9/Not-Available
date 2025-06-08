public class Blackberry extends Mobile {

    public Blackberry (String manufacture, String operatingSystem, String model, Double cost){
        super(manufacture,operatingSystem,model,cost);

    }

    public Blackberry (String manufacture, String operatingSystem){
        super(manufacture, operatingSystem);
    }

    @Override
    public double getDiscountedPrice(){
        return cost * 0.85;
    }

}
