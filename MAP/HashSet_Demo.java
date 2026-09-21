i,port java.util.*;
public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);
        //remove
        set.remove(30);
        System.out.println(set);
        //contains
        System.out.println(set.contains(20));

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);   
        set1.add(20);
        set1.add(30);

        set1.add(40);
        set1.add(50);
        //set1.add(null); //null is not allowed in treeset
        System.out.println(set1);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(null);
        set2.add(40);
        System.out.println(set2);
        //time complexity of all operation is O(1) in hashset


        //loop through the set
        for(int x : set ){
            System.out.println(x+" ");
        }
        System.out.println();
    }
}