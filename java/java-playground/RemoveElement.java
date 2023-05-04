class RemoveElement {
    public static void main(String[] args) {

    }
    
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                // swap with the last element and reset index
                int temp = nums[--len];
                nums[len] = nums[i];
                nums[i] = temp;
                i--;  // reset
            }
        } 
        return len;
    }
}
