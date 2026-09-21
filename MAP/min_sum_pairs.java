import java.util.*;

public class min_sum_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Sum_Pair(arr));
    }

    public static int Sum_Pair(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i< arr.length ; i++){
            pq.add(arr[i]);
        }
        int sum = 0;
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            pq.add(a+b);y
            sum += a + b;
        }
        return sum ;
    }
}