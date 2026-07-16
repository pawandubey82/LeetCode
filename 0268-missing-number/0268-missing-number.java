class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 1; i <= n;i++){
            ans = ans ^ i;
        }
        for(int i = 0; i< n;i++){
            ans = ans ^ nums[i];
        }
        return ans;


        // // xor with all array elemet
        // int xorSum =0;
        // for(int n:nums){
        //     xorSum = xorSum ^ n;
        // }
        // // Xor with all element in range
        // int n = nums.length;
        // for(int i=0;i<=n ;i++){
        //     xorSum = xorSum ^i;
        // }
        // //ans mil jaega
        // return xorSum;
    }
}