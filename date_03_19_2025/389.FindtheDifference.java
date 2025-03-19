//389. Find the Difference

class Solution {
    public char findTheDifference(String s, String t) {
        int length1=s.length();
        int length2=t.length();

        int total1=0;
        int total2=0;

        for(int i=0;i<length1;i++)
        {
            total1+=s.charAt(i);
        }

           for(int i=0;i<length2;i++)
        {
            total2+=t.charAt(i);
        }

    return (char)(total2-total1);
   }
}
