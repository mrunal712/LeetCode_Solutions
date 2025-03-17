//242. Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        int length_s=s.length();
        int length_t=t.length();

        if(length_s!=length_t)
        {
            return false;
        }
        
        else{
           int count[]=new int[26];
           for(int i=0;i<length_s;i++)
            {
                count[s.charAt(i)-'a']++;
            }

            for(int i=0;i<length_t;i++)
            {
                count[t.charAt(i)-'a']--;
            }

            for(int i=0;i<26;i++)
            {
                if(count[i]!=0)
                return false;
            }
        }
        return true;
    }
}
