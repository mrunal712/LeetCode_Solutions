//136. Single Number

class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}

TestCases:
1) Input: nums = [2,2,1]        Output: 1
2) Input: nums = [4,1,2,1,2]    Output: 4
