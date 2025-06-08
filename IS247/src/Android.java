public class Android extends Mobile{

    public Android (String manufacture, String operatingSystem, String model, Double cost){
        super(manufacture,operatingSystem,model,cost);

    }

    public Android (String manufacture, String operatingSystem){
        super(manufacture, operatingSystem);
    }

    @Override
    public double getDiscountedPrice(){
        return cost * 0.90;
    }

}
