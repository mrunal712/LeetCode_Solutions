//88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexNums1 = m - 1;
        int indexNums2 = n - 1;
        int mergeIndex = m + n - 1;

        while (indexNums1 >= 0 && indexNums2 >= 0) {
            if (nums1[indexNums1] > nums2[indexNums2]) {
                nums1[mergeIndex] = nums1[indexNums1];
                indexNums1--;
            } else {
                nums1[mergeIndex] = nums2[indexNums2];
                indexNums2--;
            }
            mergeIndex--;
        }

        while (indexNums2 >= 0) {
            nums1[mergeIndex] = nums2[indexNums2];
            indexNums2--;
            mergeIndex--;
        }
    }
}


TestCases:
1) Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
   Output: [1,2,2,3,5,6]
2) Input: nums1 = [1], m = 1, nums2 = [], n = 0
   Output: [1]
