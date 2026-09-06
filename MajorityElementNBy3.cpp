class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int majority = nums.size() / 3;
        int count1 = 0; 
        int count2 = 0;
        int element1 = INT_MIN;
        int element2 = INT_MIN;
        for(int i = 0; i<nums.size(); i++){
            if(count1 == 0 && element2 != nums[i]){
                count1++;
                element1 = nums[i];
            }
            else if(count2 == 0 && element1 != nums[i]){
                count2++;
                element2 = nums[i];
            }
            else if(element1 == nums[i]){
                count1++;
            }
            else if(element2 == nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        vector<int> ans;
        count1 = 0;
        count2 = 0;
        for(int i = 0; i<nums.size(); i++){
            if(element1 == nums[i]) count1++;
            if(element2 == nums[i]) count2++;
        }
        if(majority < count1) ans.push_back(element1);
        if(majority < count2) ans.push_back(element2);
        return ans;
    }
};