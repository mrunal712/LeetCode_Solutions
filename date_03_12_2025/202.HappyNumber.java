//202. Happy Number

import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        
        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        
        return true;
    }
}

TestCases:
1) Input: n = 19   Output: true
2) Input: n = 2    Output: false
