package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {

        //String str = "Hello, World, Java";
        //String[] strArray  = str.split(",");
        //String[] strArray = str.split("\\s+");

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        String str = scanner.nextLine();
        String[] strArray = str.split("\\s+"); // \s+ 한개 이상의 공백도 구분으로 포함

        for(String s : strArray){
            System.out.println(s.toString());
        }

    }
}
