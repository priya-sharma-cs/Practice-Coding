package HashMapFile;

public class HashMapClint {
    public static void main(String[] args) {
        Hashmap<String, Integer> map = new Hashmap<>();
        map.put("Ankit", 99);
        map.put("Manish", 98);
        map.put("Aryan", 98);
        map.put("Jyoti", 97);
        map.put("Ankit", 99); // duplicate key will not be added
        //map.put(null, 100); // null key is allowed
        //map.put("Rohit", null); // null value is allowed
        System.out.println(map);
    }
    
}
