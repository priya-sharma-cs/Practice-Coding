package HashMapFile;

public class Hashmap<K, V> {

    class Node<K, V> {

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

    public Hashmap() {
        this(4);
    }

    @SuppressWarnings("unchecked")
    public Hashmap(int size) {
        arr = (Node<K, V>[]) new Node[size];
    }

    public void put(K key, V value) {

        int idx = hashfun(key);
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

        if (size > arr.length * 0.75) {
            rehash();
        }
    }

    public V get(K key) {

        int idx = hashfun(key);
        Node<K, V> temp = arr[idx];

        while (temp != null) {

            if (temp.key.equals(key)) {
                return temp.value;
            }

            temp = temp.next;
        }

        return null;
    }

    public boolean containsKey(K key) {

        int idx = hashfun(key);
        Node<K, V> temp = arr[idx];

        while (temp != null) {

            if (temp.key.equals(key)) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public V remove(K key) {

        int idx = hashfun(key);

        Node<K, V> temp = arr[idx];
        Node<K, V> prev = null;

        while (temp != null) {

            if (temp.key.equals(key)) {

                if (prev == null) {
                    arr[idx] = temp.next;
                } else {
                    prev.next = temp.next;
                }

                size--;
                return temp.value;
            }

            prev = temp;
            temp = temp.next;
        }

        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void rehash() {

        Node<K, V>[] oldArr = arr;

        arr = (Node<K, V>[]) new Node[oldArr.length * 2];

        size = 0;

        for (int i = 0; i < oldArr.length; i++) {

            Node<K, V> temp = oldArr[i];

            while (temp != null) {

                put(temp.key, temp.value);

                temp = temp.next;
            }
        }
    }

    public int hashfun(K key) {

        int idx = key.hashCode() % arr.length;

        if (idx < 0) {
            idx += arr.length;
        }

        return idx;
    }

    public void display() {

        for (int i = 0; i < arr.length; i++) {

            Node<K, V> temp = arr[i];

            System.out.print(i + " : ");

            while (temp != null) {

                System.out.print(
                    temp.key + "=" + temp.value + " -> "
                );

                temp = temp.next;
            }

            System.out.println("null");
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("{");

        for (int i = 0; i < arr.length; i++) {

            Node<K, V> temp = arr[i];

            while (temp != null) {

                sb.append(temp.key)
                  .append("=")
                  .append(temp.value)
                  .append(", ");

                temp = temp.next;
            }
        }

        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }

        sb.append("}");

        return sb.toString();
    }
}