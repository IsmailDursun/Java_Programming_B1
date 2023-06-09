package day25_methods;

import my_util.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverse("apple"));

        System.out.println(StringUtil.fixFormat("jaMES"));

        System.out.println(StringUtil.frequencyOfCharacter("apple", 'p'));

        System.out.println(StringUtil.frequencyOfCharacter("apple", 'z'));

        System.out.println(StringUtil.uniqueCharacters("aaaabcdddeeeffzy"));

        System.out.println(StringUtil.uniqueCharacters("java"));

        System.out.println(StringUtil.uniqueCharacters("eeiioo"));

        System.out.println(StringUtil.uniqueCharacters("apple"));

    }
}
