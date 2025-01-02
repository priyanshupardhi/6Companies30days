class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        // System.out.print(mid);
        int iteration = 0;
        for(int n:nums){
            iteration+=Math.abs(mid-n);
        }
        return iteration;
    }
}
