package fc.java.course2.part1;

import java.util.Locale;

public class StringManipulation {
    public static void main(String[] args) {
        String str = new String("HelloWorld");
        char firstChar = str.charAt(2);
        String replacedString = str.replaceAll("o","x");
        int index = str.indexOf("W");
        int length = str.length();
        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();
        String substring = str.substring(5); //World
        String substring2 = str.substring(5,8); //Wor
        int index2 = str.indexOf("Wor");
        System.out.println(index2); //Wor 의 첫 인덱스
        int index3 = str.indexOf("Wr");
        System.out.println(index3); // 없으면 -1

        System.out.println(str);
        System.out.println(firstChar);
        System.out.println(replacedString);
        System.out.println(index);
        System.out.println(length);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(substring);
        System.out.println(substring2);

        for (int i = 0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
