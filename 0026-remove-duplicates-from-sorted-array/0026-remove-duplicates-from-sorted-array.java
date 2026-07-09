class Solution {
    public int removeDuplicates(int[] nums) {
    int i = 0;
    int j = 1;
    int n = nums.length;

    while(j<n){
        // Matching Case
        if(nums[i] == nums[j]){
            j++;
        }
        else{
            // No Match
            i++;
            nums[i] = nums[j];
            j++;
        }
    }
        return i+1;
    }
}