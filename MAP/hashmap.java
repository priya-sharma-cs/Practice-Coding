public class HashMap<K, V> {

    static class Node<K, V> {

        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size;
    private Node<K, V>[] arr;

    public HashMap() {
        this(4);
    }

    @SuppressWarnings("unchecked")
    public HashMap(int n) {
        arr = (Node<K, V>[]) new Node[n];
    }

    public void put(K key, V value) {

        int idx = hashfunc(key);

        Node<K, V> temp = arr[idx];

        while (temp != null) {

            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }

            temp = temp.next;
        }

        Node<K, V> nn = new Node<>(key, value);

        nn.next = arr[idx];
        arr[idx] = nn;

        size++;
    }

    public int hashfunc(K key) {

        int idx = key.hashCode() % arr.length;

        if (idx < 0) {
            idx += arr.length;
        }

        return idx;
    }
}