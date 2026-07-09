class Solution {
    public int missingNumber(int[] nums) {
        // xor with all array elemet
        int xorSum =0;
        for(int n:nums){
            xorSum = xorSum ^ n;
        }
        // Xor with all element in range
        int n = nums.length;
        for(int i=0;i<=n ;i++){
            xorSum = xorSum ^i;
        }
        //ans mil jaega
        return xorSum;
    }
}