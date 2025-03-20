//448. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        int[] frequency = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            frequency[nums[i] - 1]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (frequency[i] == 0) {
                numbers.add(i + 1);
            }
        }
    return numbers;
    }
}
