package HashMapFile;
public class StringBuilder_vs_StringTC {
    public static void main(String[] args){
    StringBuilderTc();
    StringTc();

    }
    public static void StringBuilderTc(){
        StringBuilder sb = new StringBuilder("Aryan");
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
            System.out.println(i);
        }
        System.out.println("complete");
    }
    public static void StringTc(){
        String str = "Aryan";
        for (int i = 0; i < 100000; i++) {
            str = str + i;
            System.out.println(i);
        }
        System.out.println("Complete");

    }
    
}
