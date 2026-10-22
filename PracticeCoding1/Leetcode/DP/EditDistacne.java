package PracticeCoding1.Leetcode.DP;

public class EditDistacne {
    public static void main(String[] args){
        String s = "FOOD";
        String t = "MONEY";
        System.out.println(Min_Ops(s,t,0,0));
    }
    public static int Min_Ops(String s , String t , int i , int j){
        if(i==s.length()){
            return t.length()-j;
        }
        if(j==t.length()){
            return s.length()-i;
        }
       int ans =0;
       if(s.charAt(i) == t.charAt(j)){
           ans = Min_Ops(s,t,i+1,j+1);
       }
       else{
           int insert = 1 + Min_Ops(s,t,i,j+1);
           int delete = 1 + Min_Ops(s,t,i+1,j);
           int replace = 1 + Min_Ops(s,t,i+1,j+1);
           ans = Math.min(insert,Math.min(delete,replace));
       }
       return ans;
    }
}
