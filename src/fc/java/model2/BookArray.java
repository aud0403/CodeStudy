package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY = 5; //수정 불가(final)=>싱수
    private BookDTO[] elements;
    private int size = 0;
    public BookArray(){
        elements = new BookDTO[DEFAULT_CAPACITY];//5개크기배열
    }

    //저장하는 동작
    public  void add(BookDTO element){
        //크기체크 if?
        if(size == elements.length){
            //크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    //얻는동작
    public BookDTO get(int index){  //-1, 5~
        //index 체크
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("index의 범위가 초가됨");
        }
        return elements[index];
    }
    //원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }


}
