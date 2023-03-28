class Solution {
    public int singleNumber(int[] nums) {
        //{6,3,2,1,1,2,3,1,2,3,2}
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

}