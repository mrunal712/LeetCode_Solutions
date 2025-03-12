//168. Excel Sheet Column Title

class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        
        while (columnNumber > 0) {
            columnNumber--;
            int remain = columnNumber % 26;
            result = (char)(remain + 'A') + result;
            columnNumber = columnNumber / 26;
        }
        
        return result;
    }
}


TestCases:

1) Input: columnNumber = 1   Output: "A"
2) Input: columnNumber = 28  Output: "AB"
3) Input: columnNumber = 701  Output: "ZY
