package lambda.app;

import java.util.HashMap;
import java.util.Map;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Meng");
                map.put("middle_name", "Wan");
                map.put("last_name", "Tut");

        //for loop
        for(var entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //lambda
        map.forEach((key, value) -> System.out.println(key +  ":" + value));


    }
}
