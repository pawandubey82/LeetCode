class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start =  mid+1;
            }
            else{
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
}
