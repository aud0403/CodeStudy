package fc.java.course2.part1;

public class HelloWorldSring {
    public static void main(String[] args) {

        String str = new String("HelloWorld"); //Heap
        String str1 = new String("HelloWorld"); //Heap
        System.out.println(str.toString());
        System.out.println(str1.toString());

        String str2 = "HelloWorld";
        String str3 = "HelloWorld";
        System.out.println(str2.toString()); //Literal Pool
        System.out.println(str3.toString()); //Literal Pool


        str=str.replace("Hello","HI");
        str2=str2.replace("H","I");

        System.out.println(str.toString());
        System.out.println(str1.toString());

        System.out.println(str2.toString()); //Literal Pool
        System.out.println(str3.toString()); //Literal Pool

    }
}
