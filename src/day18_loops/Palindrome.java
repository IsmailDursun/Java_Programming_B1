package day18_loops;

public class Palindrome {
    public static void main(String[] args) {
        String word = "racecar";
        String reverse = "";

        for(int i =  word.length()-1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        System.out.println(word);
        System.out.println(reverse);

        System.out.println((word.equals(reverse) ? "Palindrome" : "Not palindrome"));;
    }
}
