import java.util.*;

public class HashMapdemo {

    public static void main(String[] args) {

        java.util.HashMap<String, Integer> map =
                new java.util.HashMap<>();

        map.put("Ankit", 99);
        map.put("Manish", 98);
        map.put("Aryan", 98);
        map.put("Jyoti", 97);

        map.put("Ankit", 99); // duplicate key will not be added

        map.put(null, 100); // null key is allowed
        map.put("Rohit", null); // null value is allowed

        System.out.println(map);

        // System.out.println(map.get("Ankit"));
        // System.out.println(map.get("Jyoti"));
        // System.out.println(map.containsKey("Ankit"));
        // System.out.println(map.containsKey("Rohit"));


        TreeMap<String, Integer> map1 = new TreeMap<>();

        // It gives output in lexicographically sorted order of keys
        map1.put("Ankit", 99);
        map1.put("Manish", 98);
        map1.put("Aryan", 98);
        map1.put("Jyoti", 97);

        map1.put("Ankit", 98); // duplicate key updates the value

        // map1.put(null, 100); // null key is not allowed in TreeMap

        map1.put("Rohit", null); // null value is allowed

        System.out.println(map1);


        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();

        map2.put("Ankit", 99);
        map2.put("Manish", 98);
        map2.put("Aryan", 98);
        map2.put("Jyoti", 97);

        map2.put("Ankit", 99); // duplicate key will update the value

        map2.put(null, 100); // null key is allowed
        map2.put("Rohit", null); // null value is allowed

        System.out.println(map2);


        // How to get all the keys and values from map

        System.out.println("Direct key print: " + map.keySet());

        System.out.println("All values: " + map.values());

        System.out.println();


        // Using for-each loop to print all the keys and values

        System.out.println(
                "Using for-each loop to print all the keys and values of map"
        );

        for (String key : map.keySet()) {

            System.out.println(key + " : " + map.get(key));
        }
    }
}