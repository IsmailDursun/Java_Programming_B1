package my_util;

public class StringUtil {

    public static String reverse (String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }return reversed;
    }
    public static String fixFormat(String str){
        str = str.trim();
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
    public static int frequencyOfCharacter(String str, char letter){

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }
    public static String uniqueCharacters(String str){

        String unique = "";
        String checked = "";

        for(int i = 0; i < str.length(); i++){

            if(checked.contains("" + str.charAt(i))){
                continue;
            }

            int count = day24_methods.StringUtil.frequencyOfCharacter(str, str.charAt(i));
            checked += str.charAt(i);

            if(count == 1){
                unique += str.charAt(i);
            }
        }

        return unique;
    }

}
