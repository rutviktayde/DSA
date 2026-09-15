class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int len_duo=len*2;
        int[] ans = new int[len_duo];
        for(int i=0; i<len; i++){
            ans[i]=nums[i];
        }
        int j=0;
        for(int i=len; i<len_duo; i++){
            ans[i]=nums[j];
            j++;
        }
        return ans;
    }
}