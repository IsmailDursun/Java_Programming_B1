package day17_loops;

public class CountHi {
    public static void main(String[] args) {

        String word = "hello";
        String newWord = "";
        int letterIndex = 0;
        while(word.length()>newWord.length()){
            newWord += ""+word.charAt(letterIndex);
            letterIndex++;
            System.out.println(newWord);
        }
    }
}
