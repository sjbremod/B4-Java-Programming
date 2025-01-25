package day25_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.fixFormat("jamES"));
        System.out.println(StringUtil.frequencyOfLetters("apple", 'z'));
        System.out.println(StringUtil.duplicateCharacters("loopcamp"));
        System.out.println(StringUtil.uniqueCharacters("loopcamp"));
    }
}
