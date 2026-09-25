public class hashmapclient {

    public static void main(String[] args) {

        java.util.HashMap<Integer, String> map = new java.util.HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map.get(2));

        map.remove(2);

        System.out.println(map.get(2));
    }
}