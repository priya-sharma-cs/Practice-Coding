
import java.util.*;

public class palindromePartitioning {

    public static void main(String[] args) {
        String s = "aab";

        List<List<String>> ans = new ArrayList<>();

        makePartition(s, 0, new ArrayList<>(), ans);

        System.out.println(ans);
    }

    public static void makePartition(
            String s, int start,
            List<String> path,
            List<List<String>> ans) {

        if (start == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int end = start; end < s.length(); end++) {

            String sub = s.substring(start, end + 1);

            if (isPalindrome(sub)) {

                path.add(sub);

                makePartition(s, end + 1, path, ans);

                path.remove(path.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}

