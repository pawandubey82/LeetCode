import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
    int sum = 0;
    int maxi = Integer.MIN_VALUE;

    for(int i=0; i<nums.length;i++){
        // Step 1 : sum create krte hai
        sum = sum + nums[i];
        // Step 2 : Maxi update krte hai
        maxi = Math.max(maxi,sum);
        // Step 3 : Sum check for negative value
        if(sum<0)
            sum =0;
    }
    return maxi;
    }
}