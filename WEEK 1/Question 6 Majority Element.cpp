class Solution {
public:
    int majorityElement(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int ma=0,best=0,ans;
        if(nums.size()==1)return nums[0];
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i]==nums[i-1])
            {
                ma++;
                if(ma>best)
                {
                    best=ma;
                    ans=nums[i];
                }
            }
            else ma=0;
        }
        return ans;
    }
};
