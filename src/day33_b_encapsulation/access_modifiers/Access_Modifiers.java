package day33_b_encapsulation.access_modifiers;
public class Access_Modifiers {

    public int a;  // public instance variable.

    int b;    // default instance variable

    private int c;   // private instance variable

    public static int x;

    static int y;   //default static variable

    private static int z;   // private static variable


    public static void main(String[] args) {

        Access_Modifiers obj = new Access_Modifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);

        //System.out.println(AccessModifiers.c); // since c is instance, cant not reach by classname. We need an object to reach.
        System.out.println(Access_Modifiers.z);
        System.out.println(Access_Modifiers.y);


    }

}