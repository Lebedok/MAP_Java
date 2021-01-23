package MAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Contacts {
    public static void main(String[] args) {

        /*
        Adam -- > 2223334445
        David -- > 55667789
         */

        Map <String, String> contacts = new HashMap<>();
        contacts.put("Adam", "2223334445");
        contacts.put("Olivia", "33344566677");
        contacts.put("David", "9998887766");

        System.out.println(contacts.containsKey("Olivia"));  //
        System.out.println(contacts.containsValue("9998887766"));


        Set<String> names = contacts.keySet();

        for (String name: names){
            System.out.println(name);




            Collection <String> phones = contacts.values();
            for (String phone : phones){
                System.out.println(phone);

            }







            printKeys(contacts);   // printed key
            printValue(contacts);   // printed value

        }
    }
    // TASK-1: Create one method will take the one map which has data type of String, String
    // and this method will print all the key from map.
    // TASK-2:  Create one method will take the one map which has data type of String, String
    // and this method will print all the values from map




    public static void printKeys(Map<String, String> map){
        Set<String> keys = map.keySet();

        for (String key: keys){
            System.out.println(key);      // print key
        }
    }


    public static void printValue(Map <String, String> map){
        Set <String> values= map.keySet();

        for (String value: values){
            System.out.println(map.get(value));
        }

    }


}
