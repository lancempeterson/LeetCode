class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start < end){
            mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        if (target > nums[start]){
            return start+1;
        } else {
            return start;
        }
    }
}