package day36_inheritence.lyft;

public class Lyft {

    String driver;

    public Lyft (String driver) {
        this.driver = driver;
    }


    public double calculateRate (int miles) {
        return miles * 9.75;
    }

}