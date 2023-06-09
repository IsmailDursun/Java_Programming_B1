package day33_a_static;
public class AppleStore {
    public static void main(String[] args) {

        iPhone phone1 = new iPhone("Iphone 14", 999.99);
        System.out.println(phone1);
        iPhone phone2 = new iPhone("Iphone 14 Pro", 1299.99);
        System.out.println(phone2);

        System.out.println("---------------");
        System.out.println(iPhone.company);
        System.out.println(iPhone.os);
        System.out.println(iPhone.appleDay);

        System.out.println("---------------");
        System.out.println(phone1.company);
        System.out.println(phone1.os);
        System.out.println(phone1.appleDay);

        System.out.println("---------------");
        System.out.println(phone2.company);
        System.out.println(phone2.os);
        System.out.println(phone2.appleDay);

        System.out.println("---------------");
        System.out.println("Android decided to buy Apple");
        iPhone.company = "Samsung";
        phone1.os = "Android";
        phone2.appleDay = true;

        System.out.println("---------------");
        System.out.println(iPhone.company);
        System.out.println(iPhone.os);
        System.out.println(iPhone.appleDay);

        System.out.println("---------------");
        System.out.println(phone1.company);
        System.out.println(phone1.os);
        System.out.println(phone1.appleDay);

        System.out.println("---------------");
        System.out.println(phone2.company);
        System.out.println(phone2.os);
        System.out.println(phone2.appleDay);

    }
}