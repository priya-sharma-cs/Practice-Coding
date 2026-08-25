import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] count = new int[5];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            count[x]++;
        }

        int taxis = count[4];

        // Groups of 3 + groups of 1
        int pair = Math.min(count[3], count[1]);
        taxis += count[3];
        count[1] -= pair;

        // Two groups of 2 can share a taxi
        taxis += count[2] / 2;
        count[2] %= 2;

        // Remaining group of 2 can share with up to two groups of 1
        if (count[2] == 1) {
            taxis++;
            count[1] = Math.max(0, count[1] - 2);
        }

        // Remaining groups of 1
        taxis += (count[1] + 3) / 4;

        System.out.println(taxis);
    }
}