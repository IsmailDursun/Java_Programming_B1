package day18_loops;
public class Backwards {

    public static void main(String[] args) {

        for(int i = 20; i > 0; i--){
            System.out.print(i);
        }
        String word = "HelloWorld";
        for(int i = word.length()-1 ; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}

