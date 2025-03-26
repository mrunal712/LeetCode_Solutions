//16. 3Sum Closest

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closestSum = Integer.MAX_VALUE;  
        Arrays.sort(nums);  
        
        for (int i = 0; i < n - 2; i++) {  
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int j = i + 1;
            int k = n - 1;
            
            while (j < k) {  
                int sum = nums[i] + nums[j] + nums[k];
                int difference = Math.abs(sum - target);
                
                if (difference < Math.abs(closestSum - target)) {
                    closestSum = sum;  
                }
                
                if (sum < target) {
                    j++;  
                } else if (sum > target) {
                    k--;  
                } else {
                    return sum;  
                }
            }
        }
      return closestSum;
    }
}
