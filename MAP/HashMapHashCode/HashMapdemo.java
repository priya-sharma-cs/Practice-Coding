import java.util.*;
public class HashMapdemo{
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Ankit" , 99);
        map.put("Manish" , 98);
        map.put("Aryan" , 98);
        map.put("Jyoti" , 97); 
        map.put("Ankit" , 99); // duplicate key will not be added   
        map.put(null , 100); // null key is allowed
        map.put("Rohit" , null); // null value is allowed

        System.out.println(map);
        // System.out.println(map.get("Ankit"));
        // System.out.println(map.get("Jyoti"));

        // System.out.println(map.containsKey("Ankit"));
        // System.out.println(map.containsKey("Rohit"));   


        TreeMap<String , Integer> map1 = new TreeMap<>();   // it gives output in laxico sorted order of keys
        map1.put("Ankit" , 99);
        map1.put("Manish" , 98);
        map1.put("Aryan" , 98);
        map1.put("Jyoti" , 97); 
        map1.put("Ankit" , 98); // duplicate key will not be added   
      //  map1.put(null , 100);             // null key is not allowed in TreeMap
        map1.put("Rohit" , null); // null value is allowed


        System.out.println(map1);


        LinkedHashMap<String , Integer> map2 = new LinkedHashMap<>();
        map2.put("Ankit" , 99);
        map2.put("Manish" , 98);
        map2.put("Aryan" , 98);
        map2.put("Jyoti" , 97); 
        map2.put("Ankit" , 99); // duplicate key will not be added   
        map2.put(null , 100); // null key is allowed
        map2.put("Rohit" , null); // null value is allowed


        System.out.println(map2);


        // how to get all the keys and values from map
        System.out.println("direct key print " + map.keySet()); // it will give all the keys in set format    

        System.out.println(map.values()); // it will give all the values in collection format

        System.out.println(); 

        //using for each loop to print all the keys and values of map

        System.out.println("using for each loop to print all the keys and values of map");
        for(String key: map.keySet()){
            System.out.println( key + " : " + map.get(key));
        }
    }
}