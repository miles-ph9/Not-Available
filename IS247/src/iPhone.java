public class iPhone extends Mobile {

    public iPhone(String manufacture, String operatingSystem, String model, Double cost ){
        super ( manufacture, operatingSystem, model, cost );
    }

    public iPhone(String manufacture, String operatingSystem){
        super(manufacture, operatingSystem);
    }

    @Override
    public double getDiscountedPrice(){
        return cost * 0.9;
    }

}
