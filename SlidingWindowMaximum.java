class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int left = 0, right = k-1, maxIndex = maxIndex(nums, 0, k-1);
        while(true){
            if(maxIndex >= left) {
                res[left++] = nums[maxIndex];
                right++;
                if(right == n) break;
                if(nums[right] >= nums[maxIndex]) maxIndex = right;

            }
            else{
                if(nums[right] >= nums[maxIndex]-1) maxIndex = right;
                else if(nums[left] >= nums[maxIndex]-1) maxIndex = left;
                else maxIndex = maxIndex(nums, left, right);
            }
        }
        return res;
    }

    public int maxIndex(int[] nums, int start, int end){
        int index = start, val = nums[start];
        for (int i = start + 1; i <= end; i++) {
            if(val <= nums[i]){
                val = nums[i];
                index = i;
            }
        }
        return index;
    }
}