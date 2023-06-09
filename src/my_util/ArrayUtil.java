package my_util;

import java.util.Arrays;

public class ArrayUtil {

    public static boolean containArr (int [] arr, int num) {

        for (int each : arr) {
            if(each == num) {

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int []  arr = {1, 2, 3, 66, 81};
        int num = 66;

        System.out.println(containArr(arr, num));
        System.out.println(containArr(new int[]{1, 2, 3}, 4));
        System.out.println(containArr(new int[]{1, 2, 3}, 3));

    }


        public static int minNumber (int [] arr) {

            int min = arr [0];
            for (int each : arr ) {
                if (each < min) {
                    min = each;
                }
            }

            return min;
        }
    public static int maxNumber (int [] arr) {

        int max = arr [0];
        for (int each : arr ) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }
        public static int minNumInArrWithSort (int [] arr) {
            Arrays.sort(arr);
            return arr[0];
        }
    /**
     *
     * This method accepts int array and the int num
     * And returns the new array with the num added at the end
     */
    public static int [] add (int [] arr, int num) {

        int [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = num;

        return newArr;

    }

    /**
     *
     * This method accepts String array and the String word
     * And returns the new array with the word added at the end
     */
    public static String [] add (String [] arr, String word) {

        String [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;

        return newArr;

    }
    /**
     *
     * This method accepts int number and the int array
     * And returns the new array with the number added at the beginning
     */

    public static int [] addElemBeginning (int num, int ... arr) {

        int [] newArr = new int[arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }
        newArr[0] = num;

        return newArr;
    }


    /**
     *
     * This method accepts String word and the String array
     * And returns the new array with the word added at the beginning
     */

    public static String [] addElemBeginning (String word, String ... arr) {

        String [] newArr = new String [arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }
        newArr[0] = word;

        return newArr;
    }
    }

