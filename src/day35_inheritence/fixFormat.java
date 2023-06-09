package day35_inheritence;

public class fixFormat {
    // write a method that accepts a string and returns a string with capitalized first character.
    public static String fixFormat (String str){
        String result = "";
        String [] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            result += strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1).toLowerCase() + " ";
        }
        return result.trim();
    }


    // Can you run to see if you are getting correct result.
    public static void main(String[] args) {
        String message = "today 8s a *ood day";
        System.out.println(fixFormat(message));
    }


    // How would check if that code works.
    /*
    I would need to check what are the requirements of the User Story.
    - Positive Case:
           Sending only workds
    - Negative Case:
            If I send number -- > what am I getting
            If I send special character -- > what am I getting
            If I send an empty string -- > what am I getting
            If I send null --- > What am I getting.

     */

}