class Solution {
public:
    int subarrayWithXor(vector<int>& nums, int k) {
        map<int,int> mpp;
        int xr = 0;
        int count = 0;
        mpp[0] = 1;
        for(int i = 0; i<nums.size(); i++){
            xr = xr ^ nums[i];
            int remove = xr ^ k;
            count+=mpp[remove];
            mpp[xr]+=1;
        }
        return count;
    }
};