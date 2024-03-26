package fc.java.course2.part1;

import fc.java.model2.BookArray;
import fc.java.model2.BookDTO;

public class MyBookArrayTest {
    public static void main(String[] args) {
        //책 3권의 데이터를 [배열]에 저장하고 출력하세요 book[] 사용X
        BookArray list = new BookArray();// 책, 길이 5
        list.add(new BookDTO("자바",15000,"한빛","홍길동"));
        list.add(new BookDTO("C++",17000,"대림","선녀"));
        list.add(new BookDTO("Pythoon",20000,"울림","심청이"));

        BookDTO vo = list.get(0);
        System.out.println(vo);//vo.toString() : BookDTO{title='자바', price=15000, company='한빛', author='홍길동'}
        vo = list.get(1);
        System.out.println(vo);//vo.toString() : BookDTO{title='C++', price=17000, company='대림', author='선녀'}
        vo = list.get(2);
        System.out.println(vo);//vo.toString() : BookDTO{title='Pythoon', price=20000, company='울림', author='심청이'}

        for(int i = 0;i< list.size();i++){
            System.out.println(vo = list.get(i));

        }

    }
}
