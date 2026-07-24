class Solution {
     List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findSubset(nums, 0, new ArrayList<>());
        return res;
    }

    public void findSubset(int nums[], int index, List<Integer> subList){
        // Base Case
        if(index == nums.length){
            res.add(new ArrayList<>(subList));
            return ;
        }

    //Pick
        subList.add(nums[index]);
        findSubset(nums, index+1, subList);

        // in Backtracking remove last added element
        subList.remove(subList.size() -1); 

        // No pick
        findSubset(nums, index+1, subList);
    }
}