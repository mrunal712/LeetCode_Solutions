//455. Assign Cookies

class Solution {
    public int findContentChildren(int[] greedFactors, int[] cookieSizes) {
        Arrays.sort(greedFactors);
        Arrays.sort(cookieSizes);
        int numberOfChildren = greedFactors.length;   
        int numberOfCookies = cookieSizes.length;    
        int contentChildrenCount = 0;
        int greedFactorIndex = 0;
        int cookieSizeIndex = 0;

        while (greedFactorIndex < numberOfChildren) {
          
            while (cookieSizeIndex < numberOfCookies && cookieSizes[cookieSizeIndex] < greedFactors[greedFactorIndex]) {
                cookieSizeIndex++;  
            }
          if (cookieSizeIndex < numberOfCookies) {
                contentChildrenCount++;       
                cookieSizeIndex++;            
            } else {
                break;
            }
        greedFactorIndex++;
        }
      return contentChildrenCount;
    }
}
