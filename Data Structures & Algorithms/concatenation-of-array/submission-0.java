class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = 2*nums.length ;
        int[] ans = new int[len];
        int left = 0 ;
        int right = nums.length ;
        for ( int num : nums){
            ans[left]= num ;
            ans[right]=num ;
            left++ ;
            right++;
        }
    return ans;  
    }
}