import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int moreNeeded = target - num;
            
            if (hashmap.containsKey(moreNeeded)) {
                return new int[] {hashmap.get(moreNeeded), i};
            }
            
            hashmap.put(num, i);
        }
        
        return new int[] {-1, -1};
    }
}
