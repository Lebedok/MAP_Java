package MAP;
import java.util.HashMap;

public class NameAgePeople {

    //Create a HashMap object called people that will store String keys and Integer values:

    public static void main(String[] args) {


        HashMap<String, String> people = new HashMap<String, String>();


        people.put("John", "Teacher");
        people.put("Steve", "Programmer");
        people.put("Make", "Manager");

        for (String i : people.keySet()) {
            System.out.println(i);        // get key

        }

        for (String i : people.keySet()) {
            System.out.println(people.get(i));    // get value
        }
    }
}
