package PracticeCoding1.Leetcode.DP;

// write by urself top to bottom and bottom to up approach in dp 

public class distinctSubsequence {
    public static void main(String[] args) {
        String s1="rabbbit";
        String s2="rabbit";
        System.out.println(Subsequence(s1,s2,0,0));
    } 
    
    //s --> coin ---> i  & t--> amount ---> j
 public static int Subsequence(String s , String t, int i  , int j) {
        if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }
     int inc = 0 , exc = 0;
     if (s.charAt(i)== t.charAt(j)){
        inc = Subsequence(s,t,i+1,j+1);
     }
     exc = Subsequence(s,t,i+1,j);
     return inc + exc;
}

}
