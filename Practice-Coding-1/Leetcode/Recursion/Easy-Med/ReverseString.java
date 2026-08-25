class Solution {
    public void reverss(char[] s, int  l , int r){
        if(l>=r){
            return;
        }
        char c = s[l];
        s[l]=s[r];
        s[r]=c;
        reverss(s,l+1,r-1);
    }

    public void reverseString(char[] s) {
        int n = s.length;
        int l =0;
        int r=n-1;
        reverss(s,l,r);
    }
    
}