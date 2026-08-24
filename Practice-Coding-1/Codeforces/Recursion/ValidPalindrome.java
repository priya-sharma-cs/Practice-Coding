class Solution {

    public boolean isPalindrome(String s) {

        int n = s.length();

        int l = 0;
        int r = n - 1;

        return checkpalindrome(s, l, r);
    }

    public boolean checkpalindrome(String s, int l, int r) {
        
          if (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
            return checkpalindrome(s, l + 1, r);
        }

      
        if (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
            return checkpalindrome(s, l, r - 1);
        }

        if (l >= r) {
            return true;
        }

        if (Character.toLowerCase(s.charAt(l)) !=
            Character.toLowerCase(s.charAt(r))) {

            return false;
        }

        return checkpalindrome(s, l + 1, r - 1);
    }
}




// 2nd Method
class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int l=0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}