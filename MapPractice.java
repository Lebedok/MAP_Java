package MAP;

import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void printKeys(Map<String, String>map){
        Set<String>keys = map.keySet();

        for (String key : keys){
            System.out.println(key);
        }
    }

    public static void main(String[] args) {

    }

}
