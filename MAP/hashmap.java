public class HashMap<K,V>{
     Class Node<K,V>{
        K key;
        V value;
        Node next;
        public Node (K key , V value){
            this.key = key;
            this.value = value;
        }
     }
     private int size;
     private Node[] arr;

     public HashMap(){
        this(4);
     }
     public HashMap(int n){
        arr = new Node[n];
     }
     public void put(K key , V value){
            int idx = hashfunc(key);
            Node temp = arr[idx];
            while(temp != null){
                if(temp.key.equals(key)){
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
     }
     public int hashfunc(K key){
         int idx = key.hashCode() % arr.length;
         if(idx < 0){
             idx += arr.length;
         }
         return idx;
     }
}