class Solution {
    public boolean isPalindrome(int x) {
        int n=x,check=x,rev=0;
        if(x<0){
            return false;
        }
        while(x>0){
            n=x%10;
            rev=rev*10+n;
            x=x/10;
        }
        System.out.println(rev);
        if(rev==check){
            return true;
        }
        if(rev!=check){
            return false;
        }
        return false;
    }
}