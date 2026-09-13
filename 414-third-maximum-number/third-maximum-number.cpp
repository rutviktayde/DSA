class Solution {
public:
    int thirdMax(vector<int>& nums) {
        int size=nums.size();
        sort(nums.begin(),nums.end());
        int max=nums[size-1],dist=1;
        if(size<3){
            return max;
        }
        for(int i=size-1; i>0; i--){
            if(nums[i]!=nums[i-1]){
                dist++;
            }
            if(dist==3){
                return nums[i-1];
            }
        }
        return nums[size-1];
    }
};