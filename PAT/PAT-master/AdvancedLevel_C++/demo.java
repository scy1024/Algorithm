class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=((right-left)>>1)+left;
            if(target==nums[mid]){
                return mid;
            } else if (nums[mid]<target) {
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
	return left;
    }
}