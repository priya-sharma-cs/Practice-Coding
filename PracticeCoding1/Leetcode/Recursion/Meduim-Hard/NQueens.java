import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();

        solve(0, n, board, ans);

        System.out.println(ans);
    }


    
    

    public static void solve(int col, int n, char[][] board,
               List<List<String>> ans) {

        // Saare columns mein Queen place ho gayi
        if (col == n) {

            List<String> current = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                current.add(new String(board[i]));
            }

            ans.add(current);
            return;
        }

        // Current column ki saari rows try karo
        for (int row = 0; row < n; row++) {

            if (!isSafe(row, col, n, board)) {
                continue;
            }

            // Queen place karo
            board[row][col] = 'Q';

            // Agle column mein jao
            solve(col + 1, n, board, ans);

            // Backtracking
            board[row][col] = '.';
        }
    }

    public static boolean isSafe(int row, int col, int n, char[][] board) {

        // 1. Left side mein same row check karo
        for (int j = col - 1; j >= 0; j--) {

            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // 2. Upper-left diagonal check karo
        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {

            if (board[i][j] == 'Q') {
                return false;
            }

            i--;
            j--;
        }

        // 3. Lower-left diagonal check karo
        i = row + 1;
        j = col - 1;

        while (i < n && j >= 0) {

            if (board[i][j] == 'Q') {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    
}
