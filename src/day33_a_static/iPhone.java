package day33_a_static;

public class iPhone {


    String model;
    double price;

    //    static String company = "Apple";
//    static String os = "IOS";
//    static boolean appleDay = false;
    static String company;
    static String os;
    static boolean appleDay;
    static String day;


    static {
        System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "IOS";
        day = "Wednesday";

        if(day.equals("Friday")){
            appleDay = true;
        }
    }


    public iPhone (String model, double price){
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}