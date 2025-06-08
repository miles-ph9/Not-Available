// Mylah Moses @mylahm2@umbc.edu
public class Main {
    public static void main(String[] args) {

        Android android = new Android ("Samsung","Android","GalaxyS21",1000.0 );
        iPhone iphone = new iPhone ("Apple","iOS","iPhone 13",1200.0 );
       Blackberry blackberry = new Blackberry("Blackberry","BB","Blackberry Key2",800.0 );
       Generic generic = new Generic ("Generic", "OS", "Basic Model", 500.0);


        printMobileDetails(generic);
        printMobileDetails(android);
       printMobileDetails(iphone);
       printMobileDetails(blackberry);




        }

    public static void printMobileDetails(Mobile mobile){
        System.out.println(mobile.toString());
        System.out.println("Discounted price: " + mobile.getDiscountedPrice());

    }

}


