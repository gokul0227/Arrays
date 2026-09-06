class Solution {
public:
    vector<int> generateRow(int row){
        int ans = 1;
        vector<int> res;
        res.push_back(ans);
        for(int col = 1; col<row; col++){
            ans = ans * (row - col);
            ans = ans / col;
            res.push_back(ans);
        }
        return res;
    }
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;
        for(int row = 1; row<=numRows; row++){
            ans.push_back(generateRow(row));
        }
        return ans;
    }
};