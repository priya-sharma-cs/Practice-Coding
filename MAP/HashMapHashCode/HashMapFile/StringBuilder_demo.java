package HashMapFile;

public class StringBuilder_demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aryan");
        System.out.println(sb);
        sb.append(" Kumar");
        System.out.println(sb);
        sb.insert(5, " Singh");
        System.out.println(sb);
        sb.delete(5, 11);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
    
}
