//171. Excel Sheet Column Number

class Solution {
    public int titleToNumber(String columnTitle) {

        int result=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            char c=columnTitle.charAt(i);
            int charValue=c-'A'+1;
              result=result*26+charValue;

        }
         return result;
    }
}
