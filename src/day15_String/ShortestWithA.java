package day15_String;

import java.util.Scanner;

public class ShortestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        String shortest = "";

        if(word1.contains("a")&&(word1.length()<=word2.length()||word1.length()<=word3.length())){
            shortest = word1;
        }else if(word2.contains("a")&&(word2.length()<=word1.length()||word2.length()<=word3.length())) {
            shortest = word2;
        }else if(word3.contains("a")&&(word3.length()<=word1.length()||word3.length()<=word2.length())) {
            shortest = word3;
        }else{
            shortest = "Not exist";
        }
        System.out.println(shortest);
    }
}
