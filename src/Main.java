import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Ryan", "Gosling", 43);

        System.out.println("Person: " + person);

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("JSON: " + json);

        Person personFromJson = gson.fromJson(json, Person.class);
        System.out.println("Person from JSON: " + personFromJson);

        boolean areEqual = person.equals(personFromJson);
        System.out.println("Objects are equal: " + areEqual);
    }
}
