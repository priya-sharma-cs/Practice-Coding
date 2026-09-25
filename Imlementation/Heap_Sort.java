import java.util.Arrays;
import java.util.PriorityQueue;

public class Heap_Sort{
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0 ; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int i=0;
        while(!pq.isEmpty()){
            arr[i] = pq.poll();
            i++;
        }   
        System.out.println(Arrays.toString(arr));
    }
}