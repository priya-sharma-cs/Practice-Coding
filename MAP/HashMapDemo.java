import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //order of 1 every operation is O(1) in hashmap
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India" , 120);
        map.put("USA" , 30);    
        map.put("China" , 150);
        map.put("UK" , 20);
        map.put("Russia" , 10);
        map.put("Germany" , 15);
        System.out.println(map);
        //get
        System.out.println(map.get("USA"));
        //contains key
        System.out.println(map.containsKey("China"));       
        //remove
        map.remove("UK");
        System.out.println(map);
        map.put(null , 100);
        
        //sorted map
        TreeMap<String , Integer> map1 = new TreeMap<>();
        map1.put("India" , 120);   
        map1.put("USA" , 30);
        map1.put("China" , 150);        
        map1.put("UK" , 20);
        map1.put("Russia" , 10); 
        // map1.put(null , 100);   
        System.out.println(map1); 
        
        LinkedHashMap<String , Integer> map2 = new LinkedHashMap<>();
        map2.put("India" , 120);    
        map2.put("USA" , 30);
        map2.put("China" , 150);
        map2.put("UK" , 20);
        map2.put("Russia" , 10);
        map2.put(null , 100);
        System.out.println(map2);

        //loop through the map
        for(Map.Entry<String , Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
         
        //loop through the map using keyset
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }
        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }   

}