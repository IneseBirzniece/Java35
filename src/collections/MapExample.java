package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> salaryMap = new HashMap<>();

        //add values to map
        salaryMap.put("Bob", 900);
        salaryMap.put("Maggie", 1500);
        salaryMap.put("John", 1460);
        salaryMap.put("Beth", 1250);

        //print out
        System.out.println(salaryMap);

        //get value from key
        System.out.println("Bob's salary: " + salaryMap.get("Bob"));

        //get all key values
        System.out.println(salaryMap.keySet());

        //size
        System.out.println(salaryMap.size());

        //check if map contains key or value
        System.out.println(salaryMap.containsKey("Elizabeth"));
        System.out.println(salaryMap.containsValue(900));

        //remove key/value from map
        salaryMap.remove("John");
        System.out.println(salaryMap);

        //example for countries and capitals

        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("UK", "London");
        capitalCity.put("Germany", "Berlin");

        System.out.println(capitalCity.get("UK"));

        for (Map.Entry<String, String> entry: capitalCity.entrySet()){
            System.out.println(entry.getKey() + " has a capital city of " + entry.getValue());
        }


    }
}
