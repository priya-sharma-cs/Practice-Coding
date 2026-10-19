import java.util.ArrayList;
import java.util.List;

public class permutationSequence{
    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        permutationSequence obj = new permutationSequence();
        String ans = obj.getPermutation(n, k);
        System.out.println(ans);
    }
    
    public String getPermutation(int n, int k) {
        StringBuilder ans = new  StringBuilder("");
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
    arr.add(i);
}
        int fact = 1; 
        for (int i = 1; i <n; i++) { 
            fact *= i; 
            } 
            k=k-1;
        while(true){
        
        ans = ans.append(arr.get(k/fact));
        arr.remove(k/fact);
        if(arr.size()==0){
            break;
        }
        k=k%fact;
        fact = fact / arr.size();
        }
        return ans.toString();
    }
    


}
