import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class LetterCombinationsofPhoneNo {
    public static void main(String[] args) {
        String digits = "23";
        List<String> ans = new ArrayList<>();
        ans = letterCombinations(digits);
        System.out.println(ans);
    }
    
    public static List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        ArrayList<String> ans = new ArrayList<>();
        if (digits.length() == 0) { return ans; }

        StringBuilder s = new StringBuilder();
        
        findCombination(digits,0,map , ans ,s );
        return ans;
    }
        
        
    
    public static void findCombination(String digits , int start, HashMap<Integer, String> map , ArrayList<String> ans , StringBuilder s ){
        if(start == digits.length()){
            ans.add(s.toString());
            return;
        }
        
            int num = digits.charAt(start) - '0';
            String sval = map.get(num);
            for(int j=0 ; j< sval.length() ; j++){
                s.append(sval.charAt(j)); 
                findCombination(digits, start + 1, map, ans, s); 
                s.deleteCharAt(s.length() - 1);

            }

        
    }


}
