import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {

            int st = sc.nextInt();
            int et = sc.nextInt();

            arr[i] = new Pair(st, et);
        }

        // Sort activities according to ending time
        Arrays.sort(arr, (a, b) -> a.et - b.et);

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int activitie = 1;
        int end = arr[0].et;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].st >= end) {
                activitie++;
                end = arr[i].et;
            }
        }

        System.out.println(activitie);

        sc.close();
    }

    static class Pair {

        int st;
        int et;

        public Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }
    }
}