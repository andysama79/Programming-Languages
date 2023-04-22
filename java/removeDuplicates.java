class removeDuplicates {
    public int remove(int[] nums) {
        int curr = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) nums[curr++] = nums[i];
        }
        nums[curr++] = nums[nums.length-1];
        return curr;
    }
}
