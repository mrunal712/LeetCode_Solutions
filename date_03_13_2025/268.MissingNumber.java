//268. Missing Number

public class Solution {
    public int missingNumber(int[] nums) {
        int res1=0;
        int res2=0;

        for (int i = 0; i < nums.length; i++) {
            res1+=i;
            res2+=nums[i];
        }
        res1+=nums.length;
        return res1-res2;
    }
}
