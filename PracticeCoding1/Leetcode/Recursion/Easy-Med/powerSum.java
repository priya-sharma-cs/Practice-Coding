public class powerSum {
    public static void main(String[] args) {
        int X = 10;
        int N = 2;
        int result = recursion(X, N, 1, 0);
        System.out.println(result);
    }

public static int recursion(int x, int n, int nn, int sum) {


if (sum == x) {
    return 1;
}

if (sum > x) {
    return 0;
}

int power = (int) Math.pow(nn, n);

if (power > x - sum) {
    return 0;
}

int include = recursion(x, n, nn + 1, sum + power);
int exclude = recursion(x, n, nn + 1, sum);

return include + exclude;


}

    
}
