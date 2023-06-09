package day33_a_static;
import my_util.*;
public class ImportStatic {

    public static void main(String[] args) {

        ArrayUtil.minNumber(new int [] {1, 2, 3,4 });

        // If there were an instance method in that package/class, we can NOT access this way because my import is -- > import static my_util.ArrayUtil.*;
        //test();
    }

}