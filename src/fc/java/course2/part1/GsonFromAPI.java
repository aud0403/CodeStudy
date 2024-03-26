package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"john\",\"age\":30}"; // JSON -> Person
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName()); //john
        System.out.println(p.getAge()); //30
        System.out.println(p.toString()); //Person{name='john', age=30}
    }
}
