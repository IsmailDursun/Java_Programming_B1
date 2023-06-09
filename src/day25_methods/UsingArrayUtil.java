package day25_methods;

import my_util.ArrayUtil;

import java.util.Arrays;

public class UsingArrayUtil {

    public static void main(String[] args) {

        int [] a = {3, 1, 6, 12, 7, 1, 20};

        System.out.println(ArrayUtil.minNumber(a));

        System.out.println(ArrayUtil.maxNumber(a));

        System.out.println(ArrayUtil.containArr(a, 12));

        System.out.println(ArrayUtil.containArr(a, 5));

        boolean result = ArrayUtil.containArr(new int[] {1, 4, 7}, 666);
        System.out.println(result);

        ArrayUtil.addElemBeginning(34, 23, 345, 23, 21213) ;

        System.out.println(Arrays.toString(   ArrayUtil.addElemBeginning(12, 45, 76, 5678, 34)  ) );

        int [] nums = {23, 564, 78, 90, 90};
        int addNum = 45645;

        System.out.println(Arrays.toString( ArrayUtil.addElemBeginning( addNum, nums)));


        String [] allWords = {"hello", "Tom", "Jerry"};
        String word = "World";

        System.out.println( Arrays.toString( ArrayUtil.addElemBeginning(word, allWords)));
    }
}
