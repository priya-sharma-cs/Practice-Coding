import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;   
public class HashSetdemp {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>(); // it gives output in random order
        set.add(1);
        set.add(2);
        set.add(3); 
        set.add(4);   
        set.add(4); // duplicate value will not be added . it ignores duplicate values
        set.add(-2);
        //set.add(null); // null value is allowed  
       

         System.out.println(set);

        // System.out.println(set.contains(20));
        // System.out.println(set.contains(100));

        // System.out.println(set.remove(-2));
        // System.out.println(set.remove(100));

        // System.out.println(set);


        TreeSet<Integer> set1 = new TreeSet<>();  // it gives output in sorted order
        set1.add(1);
        set1.add(2);
        set1.add(3); 
        set1.add(4);   
        set1.add(4); // duplicate value will not be added . it ignores duplicate values
        set1.add(-2);
        //set1.add(null); // null value is not allowed 

        System.out.println(set1);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(); // give output in insertion order
        set2.add(1);
        set2.add(2);
        set2.add(3); 
        set2.add(4);   
        set2.add(4); // duplicate value will not be added
        set2.add(-2);
        set2.add(null); // null value is allowed  
       

         System.out.println(set2);  

        // apply for each loop to print all the values of set
         for(int x: set){
            System.out.print(x  + " ");
         }
         System.out.println();






    }
    
}
