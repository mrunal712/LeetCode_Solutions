//387. First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        int[] frequency=new int[26];
        int length=s.length();

        for(int i=0;i<length;i++)
        {
            char c=s.charAt(i);
            int val=c-'a';
            frequency[val]++;
            
        }

       for(int i=0;i<length;i++)
        {
            char c=s.charAt(i);
            int val=c-'a';
            if(frequency[val]==1)
            {
                return i;
            }

        }
        
        return -1;
    }
}
