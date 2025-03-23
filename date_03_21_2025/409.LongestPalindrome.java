//409. Longest Palindrome

import java.util.*;

class Solution {
	public int longestPalindrome(String s) {
		int[] charCount = new int[128];

		for (char c : s.toCharArray()) {
			charCount[c]++;
		}
    int palindromeLength = 0;
		boolean hasOdd = false;
    
    for (int count : charCount) {
			if (count % 2 == 0) {
				palindromeLength += count;
			} else {
				palindromeLength += count - 1;
				hasOdd = true;
      }
		}

		if (hasOdd) {
			palindromeLength += 1;
		}

		return palindromeLength;
	}
}
