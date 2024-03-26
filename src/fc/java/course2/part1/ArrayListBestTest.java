package fc.java.course2.part1;

import fc.java.model2.BookDTO;

import java.util.*;

public class ArrayListBestTest {
    public static void main(String[] args) {
        //Book 3권을 배열에 저장하고 출력
        //Book[], Object[]
        List<BookDTO> list = new ArrayList<BookDTO>(10); //기본크기 10 <>재네릭을 넣어 업다운 캐스팅 안해도됨
        list.add(new BookDTO("자바",15000,"한빛","홍길동"));
        list.add(new BookDTO("C++",17000,"대림","선녀"));
        list.add(new BookDTO("Pythoon",20000,"울림","심청이"));

        BookDTO vo = list.get(0); //bookDTO <-----(bookDTO)object
        System.out.println(vo.toString());
        vo = list.get(1); //bookDTO <-----(bookDTO)object
        System.out.println(vo.toString());
        vo = list.get(2); //bookDTO <-----(bookDTO)object
        System.out.println(vo.toString());

        for(int i = 0;i<list.size();i++){
            BookDTO b = list.get(i);
            System.out.println(b); //Object -> BookDTo(JVM에서 자동으로 BookDTO의 toStirng()으로 변환)
        }
    }
}
