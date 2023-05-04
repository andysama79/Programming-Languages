public class MaxOnesSequence {
    public static void main(String[] args) {
        
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, length = 0;
        for (int n: nums) {
            length = n == 1 ? length + 1 : 0;
            max = Math.max(max, length);
        }
        return max;
    }
}
